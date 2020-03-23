package com.qyd.play.designModel.observer1.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 10:52
 * @Description:一个监听者
 */
public class Boss implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("boss:知道了！");
        System.out.println(o.getClass().getName()+"做了："+arg);
    }
}
