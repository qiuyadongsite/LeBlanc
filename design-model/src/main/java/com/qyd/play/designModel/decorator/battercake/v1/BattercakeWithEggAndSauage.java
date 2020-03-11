package com.qyd.play.designModel.decorator.battercake.v1;

/**
 * Created by qyd.
 */
public class BattercakeWithEggAndSauage extends BattercakeWithEgg {

    protected String getMsg(){ return super.getMsg() + "+1根香肠";}

    public int getPrice(){ return super.getPrice() + 2;}

}
