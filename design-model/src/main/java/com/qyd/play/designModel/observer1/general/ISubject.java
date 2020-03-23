package com.qyd.play.designModel.observer1.general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 10:31
 * @Description:抽象主题角色
 */
public abstract class ISubject {
    public List<IObserver> listens=new ArrayList<>();

    public void addListen(IObserver observer){
        listens.add(observer);
    }
    public void trigger(Object o){
        for(IObserver observer:listens){
            observer.trigger(o);
        }
    }
}
