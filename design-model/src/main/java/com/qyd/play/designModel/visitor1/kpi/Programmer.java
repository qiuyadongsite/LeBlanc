package com.qyd.play.designModel.visitor1.kpi;

import java.util.Random;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 14:52
 * @Description:
 */
public class Programmer implements Worker {
    @Override
    public void accept(Boss boss) {
        boss.visit(this);
    }
    public void get(){
        System.out.println("Programmer get:"+ new Random().nextInt(100));
    }
}
