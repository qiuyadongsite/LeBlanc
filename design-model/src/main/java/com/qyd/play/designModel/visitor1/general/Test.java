package com.qyd.play.designModel.visitor1.general;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 14:35
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        SomeDataConstruction someDataConstruction=new SomeDataConstruction();
        someDataConstruction.accept(new OneVisitor());
        someDataConstruction.accept(new OtherVisitor());
    }
}
