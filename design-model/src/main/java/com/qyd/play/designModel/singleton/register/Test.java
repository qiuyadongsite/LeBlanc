package com.qyd.play.designModel.singleton.register;

/**
 * @Auther: qiuyd
 * @Date: 2020/2/27 08:48
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        RegisterEnumSingleton enumSingleton=RegisterEnumSingleton.Instance;
        enumSingleton.setObject(new Object());
    }
}
