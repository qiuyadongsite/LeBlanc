package com.qyd.play.designModel.adapter.general.classadapter;

/**
 * Created by qyd.
 */
public class Adapter extends Adaptee implements Target {
    public int request() {
        return super.specificRequest() / 10;
    }
}
