package com.qyd.play.designModel.singleton.lazy;

/**
 * @Auther: qiuyd
 * @Date: 2020/2/27 08:34
 * @Description:
 */
public class LazySyn1Singleton {
    private static LazySyn1Singleton Instance=null;
    private LazySyn1Singleton(){
    }
    public synchronized static LazySyn1Singleton getInstance(){
        if(Instance==null){
            Instance=new LazySyn1Singleton();
        }
        return Instance;
    }
}
