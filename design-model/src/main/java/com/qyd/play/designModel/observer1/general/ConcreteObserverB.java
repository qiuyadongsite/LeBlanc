package com.qyd.play.designModel.observer1.general;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 10:41
 * @Description:
 */
public class ConcreteObserverB implements IObserver {
    @Override
    public void trigger(Object o) {
        System.out.println("B:"+o.toString());
    }
}
