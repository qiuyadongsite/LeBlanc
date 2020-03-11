package com.qyd.play.designModel.decorator.battercake.v2;

/**
 * Created by qyd.
 */
public class BattercakeDecorator extends Battercake{


    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    protected String getMsg(){ return this.battercake.getMsg();}

    public int getPrice(){ return this.battercake.getPrice();}

}
