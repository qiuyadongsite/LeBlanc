package com.qyd.play.designModel.observer1.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 11:04
 * @Description:
 */
public class WorkA {
    @Subscribe
    public void doSomething(Object some){
        System.out.println("workA:"+some);
    }
    @Subscribe
    public void doEat(Object some){
        System.out.println("workA:去吃饭了！"+some);
    }
}
