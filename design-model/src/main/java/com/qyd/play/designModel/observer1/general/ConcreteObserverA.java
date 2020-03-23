package com.qyd.play.designModel.observer1.general;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 10:39
 * @Description:具体观察者
 */
public class ConcreteObserverA implements IObserver{
    @Override
    public void trigger(Object o) {
        System.out.println("A:"+o.toString());
    }
}
