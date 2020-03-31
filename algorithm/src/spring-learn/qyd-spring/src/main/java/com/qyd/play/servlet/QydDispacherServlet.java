package com.qyd.play.servlet;

import com.qyd.play.annotation.*;

import javax.print.DocFlavor;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/30 09:11
 * @Description:
 */
public class QydDispacherServlet extends HttpServlet {

    private Properties properties=new Properties();
    private Map<String,Object> ioc=new HashMap<>();
    private Map<String,Method> handlerMapping=new HashMap<>();


    //1,配置阶段
    //<1.web.xml 配置servlet
    //<2.application.properties, 灵活配置参数
    //2.初始化配置
    @Override
    public void init(ServletConfig config) throws ServletException {

        //加载配置
        loadConfig(config);

        //扫包 //初始化ioc容器
        scanPackage(properties.getProperty("scanPackage"));
        initIoc();

        //初始化DI
        intitDI();


        //初始化mvc HandlerMapping
        initMVCHandlerMapping();

        System.out.println("init successed!");
    }

    private void scanPackage(String scanPackage) {
        if("".equals(scanPackage.trim())){return;}
        URL url = this.getClass().getClassLoader()
                .getResource("/" + scanPackage.replaceAll("\\.","/"));
        File file = new File(url.getFile());

        for (File file1 : file.listFiles()) {
            if(file1.isDirectory()){
                scanPackage(scanPackage+"."+file1.getName());
            }else{

                //判断是class文件
                if(!file1.getName().endsWith(".class")){continue;}
                String beanName=toLowFirstClassName(file1.getName().replaceAll(".class",""));
                String className=scanPackage+"."+file1.getName().replaceAll(".class","");

                try {
                    Class clazz=Class.forName(className);
                    //获取类
                    if(clazz.isAnnotationPresent(QydController.class)){
                        //controller注解
                        ioc.put(beanName,clazz.newInstance());
                    }else  if(clazz.isAnnotationPresent(QydService.class)){
                        Class[] interfaces = clazz.getInterfaces();
                        beanName=toLowFirstClassName(interfaces[0].getSimpleName());
                        ioc.put(beanName,clazz.newInstance());
                    }else{
                        continue;
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }

    private String toLowFirstClassName(String name) {
        char[] chars=name.toCharArray();
        chars[0]+=32;
        return String.valueOf(chars);
    }

    private void initMVCHandlerMapping() {
        if(ioc.isEmpty()){return;}
        for (Map.Entry<String, Object> objectEntry : ioc.entrySet()) {
            if(!objectEntry.getValue().getClass().isAnnotationPresent(QydController.class)){continue;}
            String basePath="";
            if(objectEntry.getValue().getClass().isAnnotationPresent(QydRequestMapping.class)){
                basePath=objectEntry.getValue().getClass().getAnnotation(QydRequestMapping.class).value();
            }
            for (Method method : objectEntry.getValue().getClass().getMethods()) {
                if(!method.isAnnotationPresent(QydRequestMapping.class)){ continue; }
                QydRequestMapping annotation = method.getAnnotation(QydRequestMapping.class);
                String path =("/"+basePath+"/"+ annotation.value()).replaceAll("/+","/");
                handlerMapping.put(path,method);
            }
        }
    }

    private void intitDI() {
        if(ioc.isEmpty()){return;}
        for (Map.Entry<String, Object> iocObjectEntry : ioc.entrySet()) {
            Class<?> aClass = iocObjectEntry.getValue().getClass();
            for (Field field:aClass.getDeclaredFields()) {
                if(!field.isAnnotationPresent(QydAutowired.class)){ continue;}
                Class<?> type = field.getType();
                String name = type.getSimpleName();
                String s = toLowFirstClassName(name);
                field.setAccessible(true);
                try {
                    field.set(iocObjectEntry.getValue(),ioc.get(s));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }
        }

    }

    private void initIoc() {


    }


    private void loadConfig(ServletConfig config) {
        String contextConfigLocation = config.getInitParameter("contextConfigLocation");
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream(contextConfigLocation);
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        StringBuffer requestURL = req.getRequestURL();
        String path=requestURL.toString().split(req.getServerName()+":"+req.getServerPort())[1];
        resp.setContentType("text/html;charset=utf-8");
        if("/".equals(path)){
            resp.getWriter().write("欢迎来到我的主页");
            return;
        }

        //调用
        Method o = handlerMapping.get(path);

        if(o!=null){
            Class<?> declaringClass = o.getDeclaringClass();
            String beanName=toLowFirstClassName(declaringClass.getSimpleName());
            Method method = this.handlerMapping.get(path);
            //第一个参数：方法所在的实例
            //第二个参数：调用时所需要的实参
            Map<String,String[]> params = req.getParameterMap();
            //获取方法的形参列表
            Class<?> [] parameterTypes = method.getParameterTypes();
            //保存请求的url参数列表
            Map<String,String[]> parameterMap = req.getParameterMap();
            //保存赋值参数的位置
            Object [] paramValues = new Object[parameterTypes.length];
            //按根据参数位置动态赋值
            for (int i = 0; i < parameterTypes.length; i ++){
                Class parameterType = parameterTypes[i];
                if(parameterType == HttpServletRequest.class){
                    paramValues[i] = req;
                    continue;
                }else if(parameterType == HttpServletResponse.class){
                    paramValues[i] = resp;
                    continue;
                }else if(parameterType == String.class){

                    //提取方法中加了注解的参数
                    Annotation[] [] pa = method.getParameterAnnotations();
                    for (int j = 0; j < pa.length ; j ++) {
                        for(Annotation a : pa[i]){
                            if(a instanceof QydQueryParam){
                                String paramName = ((QydQueryParam) a).value();
                                if(!"".equals(paramName.trim())){
                                    String value = Arrays.toString(parameterMap.get(paramName))
                                            .replaceAll("\\[|\\]","")
                                            .replaceAll("\\s",",");
                                    paramValues[i] = value;
                                }
                            }
                        }
                    }

                }
            }
            try {
                o.invoke(ioc.get(beanName),new Object[]{parameterMap.get("name")[0],req,resp});
            } catch (Exception e) {

                resp.sendError(500,"服务器内部错误;"+e.getMessage());



            }
        }else {

            resp.sendError(404,"找不到该路径");

        }
    }
}
