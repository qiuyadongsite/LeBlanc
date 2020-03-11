package com.qyd.play.designModel.singleton.lazy;

/**
 * @Auther: qiuyd
 * @Date: 2020/2/27 08:34
 * @Description:
 * 优点：安全问题解决，性能也高了.也优雅了
 * 静态内部类在使用的时候才加载
 * 利用了java语言类加载特点
 */
public class LazyStaticInnerSingleton {
    private LazyStaticInnerSingleton(){
    }
    public  static LazyStaticInnerSingleton getInstance(){
        return LazyStaticInnerSingletonHolder.Instance;
    }
    private static class LazyStaticInnerSingletonHolder{
      private static LazyStaticInnerSingleton Instance=new LazyStaticInnerSingleton();
    }
}
