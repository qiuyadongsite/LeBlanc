package com.qyd.play.designModel.observer1.mouseevent;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 11:15
 * @Description:
 */
public abstract class MouseSubject {
    public Map<String, List<MouseObserver>> listens=new HashMap<>();

    public void addListen(String type,MouseObserver observer){
        List<MouseObserver> mouseObservers=new ArrayList<>();
        if(listens.containsKey(type)){
           mouseObservers = listens.get(type);
       }
        mouseObservers.add(observer);
        listens.put(type,mouseObservers);
    }

    public void trigger(String type){
        List<MouseObserver> mouseObservers = listens.get(type);
        for (MouseObserver mouseObserver:mouseObservers){
            try {
                Method method=mouseObserver.getClass().getMethod(type);
                method.invoke(mouseObserver);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
