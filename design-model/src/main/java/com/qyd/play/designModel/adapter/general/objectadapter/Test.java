package com.qyd.play.designModel.adapter.general.objectadapter;

/**
 * Created by qyd.
 */
public class Test {
    public static void main(String[] args) {
        Target adapter = new Adapter(new Adaptee());
        int result = adapter.request();
        System.out.println(result);
    }
}
