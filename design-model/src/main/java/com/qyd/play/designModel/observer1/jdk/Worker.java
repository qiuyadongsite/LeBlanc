package com.qyd.play.designModel.observer1.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 10:53
 * @Description:具体工作者
 */
public class Worker extends Observable {
    public void doSomething(String some){
        System.out.println("我做了："+some);
        setChanged();
        notifyObservers(some);
    }
}
