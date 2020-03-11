package com.qyd.play.designModel.decorator.battercake.v2;

/**
 * Created by qyd.
 */
public class SauageDecorator extends BattercakeDecorator{

    public SauageDecorator(Battercake battercake) {
        super(battercake);
    }

    protected String getMsg(){ return super.getMsg() + "1根香肠";}

    public int getPrice(){ return super.getPrice() + 2;}

}
