package com.qyd.play.designModel.observer1.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 10:58
 * @Description:
 */
public class Manager implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Manager:知道了！");
        System.out.println(o.getClass().getName()+"做了："+arg);
    }
}
