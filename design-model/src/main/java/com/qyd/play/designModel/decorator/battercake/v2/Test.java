package com.qyd.play.designModel.decorator.battercake.v2;

/**
 * Created by qyd.
 */
public class Test {
    public static void main(String[] args) {


        Battercake battercake;

        battercake = new BaseBattercake();

        battercake = new EggDecorator(battercake);

        battercake = new EggDecorator(battercake);

        battercake = new SauageDecorator(battercake);

        System.out.println(battercake.getMsg() + ",总价" + battercake.getPrice());

    }
}
