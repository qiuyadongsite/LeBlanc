package com.qyd.play.designModel.singleton.threadLocal;

/**
 * @Auther: qiuyd
 * @Date: 2020/2/27 09:02
 * @Description:
 * 多线程下的单例
 */
public class ThreadLocalSingleton {
    private ThreadLocalSingleton(){}
    private static ThreadLocal<ThreadLocalSingleton> Instance=new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };
    public static ThreadLocalSingleton getInstance(){
        return Instance.get();
    }

}
