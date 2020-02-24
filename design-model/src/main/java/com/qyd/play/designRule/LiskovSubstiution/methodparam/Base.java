package com.qyd.play.designRule.LiskovSubstiution.methodparam;

import java.util.HashMap;

/**
 * Created by qiuyd on 2020/2/16.
 */
public class Base {
    public void method(HashMap map){
        System.out.println("父类执行");
    }
}
