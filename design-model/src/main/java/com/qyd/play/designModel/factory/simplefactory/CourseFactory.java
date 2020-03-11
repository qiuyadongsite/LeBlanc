package com.qyd.play.designModel.factory.simplefactory;

import com.qyd.play.designModel.factory.ICourse;
import com.qyd.play.designModel.factory.JavaCourse;


/**
 * Created by qyd.
 */
public class CourseFactory {

//    public ICourse create(String name){
//        if("java".equals(name)){
//            return new JavaCourse();
//        }else if("python".equals(name)){
//            return new PythonCourse();
//        }else {
//            return null;
//        }
//    }

//    public ICourse create(String className){
//        try {
//            if (!(null == className || "".equals(className))) {
//                return (ICourse) Class.forName(className).newInstance();
//            }
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return null;
//    }

    public ICourse create(Class<? extends ICourse> clazz){
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
