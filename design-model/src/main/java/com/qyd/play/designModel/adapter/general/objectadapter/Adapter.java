package com.qyd.play.designModel.adapter.general.objectadapter;

/**
 * Created by qyd.
 */
public class Adapter implements Target {
    private Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    public int request() {
        return adaptee.specificRequest() / 10;
    }
}
