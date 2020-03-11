package com.qyd.play.designModel.adapter.general.classadapter;

/**
 * Created by qyd.
 */
public class Test {
    public static void main(String[] args) {
        Target adapter = new Adapter();
        int result = adapter.request();
        System.out.println(result);
    }
}
