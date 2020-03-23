package com.qyd.play.designModel.observer1.mouseevent;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 11:30
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        MouseObserverA mouseObserverA=new MouseObserverA();
        Mouse mouse=new Mouse();
        mouse.addListen(MouseEvent.ON_CLICK,mouseObserverA);
        mouse.addListen(MouseEvent.ON_MOVE,new MouseObserverB());
        mouse.onclick();
        mouse.onmove();
    }
}
