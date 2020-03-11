package com.qyd.play.designModel.proxy.general;

/**
 * Created by qyd.
 */
public class RealSubject implements ISubject {

    public void request() {
        System.out.println("real service is called.");
    }

}
