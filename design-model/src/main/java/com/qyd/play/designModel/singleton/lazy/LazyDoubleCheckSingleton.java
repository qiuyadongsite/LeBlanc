package com.qyd.play.designModel.singleton.lazy;

/**
 * @Auther: qiuyd
 * @Date: 2020/2/27 08:34
 * @Description:
 * 优点：安全问题解决，性能也高了
 * 缺点：不优雅
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton Instance=null;
    private LazyDoubleCheckSingleton(){
    }
    public  static LazyDoubleCheckSingleton getInstance(){
        if(Instance==null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(Instance==null){
                    Instance=new LazyDoubleCheckSingleton();
                }
            }
        }
        return Instance;
    }
}
