package com.qyd.play.designModel.singleton.hungery;

/**
 * @Auther: qiuyd
 * @Date: 2020/2/27 08:25
 * @Description:
 * 优点：效率和性能比较高
 * 缺点：占内存
 */
public class HungerySingleton {
    private static HungerySingleton Instance=new HungerySingleton();
    private HungerySingleton(){
        //防止反射穿透
        if(Instance!=null){
            throw new RuntimeException("不能反射初始化！");
        }
    }
    public static HungerySingleton getInstance(){
        return Instance;
    }
    public Object ReadSolve(){
        //防止序列化破坏
        return Instance;
    }
}
