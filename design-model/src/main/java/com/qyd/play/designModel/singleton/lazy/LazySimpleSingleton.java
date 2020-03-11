package com.qyd.play.designModel.singleton.lazy;

/**
 * @Auther: qiuyd
 * @Date: 2020/2/27 08:30
 * @Description:
 * 优点：内存占用率下去了
 * 缺点：线程不安全：不一致、覆盖
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton Instance=null;
    private LazySimpleSingleton(){}
    public static LazySimpleSingleton getInstance(){
        if(Instance==null){
            Instance=new LazySimpleSingleton();
        }
        return Instance;
    }
}
