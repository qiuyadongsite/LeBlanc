package com.qyd.play.designModel.adapter.demo.power.interfaceadapter;


/**
 * Created by qyd.
 */
public class Test {
    public static void main(String[] args) {
        DC adapter = new PowerAdapter(new AC220());
        adapter.output5V();
    }
}
