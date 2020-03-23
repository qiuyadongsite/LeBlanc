package com.qyd.play.designModel.observer1.mouseevent;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 11:17
 * @Description:
 */
public class MouseObserverA implements MouseObserver {
    @Override
    public void click() {
        System.out.println("A---click");
    }

    @Override
    public void move() {
        System.out.println("A---move");
    }
}
