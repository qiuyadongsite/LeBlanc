package com.qyd.play.designModel.observer1.guava;

import com.google.common.eventbus.EventBus;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 11:06
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        EventBus eventBus=new EventBus();
        eventBus.register(new WorkA());
        eventBus.register(new WorkB());
        eventBus.post("test");
    }
}
