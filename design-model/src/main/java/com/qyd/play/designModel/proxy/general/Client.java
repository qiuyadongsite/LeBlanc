package com.qyd.play.designModel.proxy.general;

/**
 * Created by qyd.
 */
public class Client {

    public static void main(String[] args) {

        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();

    }

}
