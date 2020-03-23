package com.qyd.play.designModel.observer1.general;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 10:46
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        ConcreteSubject subject=new ConcreteSubject();
        IObserver a=new ConcreteObserverA();
        IObserver b=new ConcreteObserverB();
        subject.addListen(a);
        subject.addListen(b);
        subject.triggerSome("test");
    }
}
