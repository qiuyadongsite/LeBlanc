package com.qyd.play.designModel.visitor1.kpi;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 15:03
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        BusinessReport businessReport=new BusinessReport();
        businessReport.accept(new CEO());
        businessReport.accept(new CFO());
    }
}
