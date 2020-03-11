package com.qyd.play.designModel.adapter.demo.power.classadapter;

/**
 * Created by qyd.
 */
public class PowerAdapter extends AC220 implements DC5 {
    public int output5V() {
        int adapterInput = super.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用Adapter输入AC" + adapterInput + "V,输出DC" + adapterOutput + "V");
        return adapterOutput;
    }
}
