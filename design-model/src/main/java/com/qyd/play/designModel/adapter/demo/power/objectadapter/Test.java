package com.qyd.play.designModel.adapter.demo.power.objectadapter;


/**
 * Created by qyd.
 */
public class Test {
    public static void main(String[] args) {
        DC5 adapter = new PowerAdapter(new AC220());
        adapter.output5V();
    }
}
