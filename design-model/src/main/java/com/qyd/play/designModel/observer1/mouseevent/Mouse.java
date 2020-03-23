package com.qyd.play.designModel.observer1.mouseevent;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 11:28
 * @Description:
 */
public class Mouse extends MouseSubject {
    public void onclick(){
        System.out.println("鼠标单击");
        this.trigger(MouseEvent.ON_CLICK);
    }
    public void onmove(){
        System.out.println("鼠标移动");
        this.trigger(MouseEvent.ON_MOVE);
    }
}
