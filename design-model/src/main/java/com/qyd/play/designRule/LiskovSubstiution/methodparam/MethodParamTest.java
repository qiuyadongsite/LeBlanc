package com.qyd.play.designRule.LiskovSubstiution.methodparam;

import java.util.HashMap;

/**
 * Created by qiuyd on 2020/2/16.
 */
public class MethodParamTest {
    public static void main(String[] args) {
        Base child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }
}
