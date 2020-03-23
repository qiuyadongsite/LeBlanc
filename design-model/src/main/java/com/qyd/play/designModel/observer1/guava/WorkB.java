package com.qyd.play.designModel.observer1.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 11:04
 * @Description:
 */
public class WorkB {
    @Subscribe
    public void doSomething(Object some){
        System.out.println("workB:"+some);
    }
    @Subscribe
    public void doEat(Object some){
        System.out.println("workB:去吃饭了！"+some);
    }
}
