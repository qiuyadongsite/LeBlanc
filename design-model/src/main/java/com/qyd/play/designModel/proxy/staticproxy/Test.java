package com.qyd.play.designModel.proxy.staticproxy;

/**
 * Created by qyd.
 */
public class Test {
    public static void main(String[] args) {
        ZhangLaosan zhangLaosan = new ZhangLaosan(new ZhangSan());
        zhangLaosan.findLove();
    }
}
