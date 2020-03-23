package com.qyd.play.designModel.visitor1.general;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 14:29
 * @Description:
 */
public class OtherVisitor implements IVisitor {
    @Override
    public void visit(OneDataConstruction oneDataConstruction) {
        System.out.println(oneDataConstruction.getCount());
        System.out.println("OtherVisitor Visitor visit"+oneDataConstruction.getClass().getName());
    }

    @Override
    public void visit(OtherDataConstruction otherDataConstruction) {
        System.out.println(otherDataConstruction.getCount());
        System.out.println("OtherVisitor Visitor visit"+otherDataConstruction.getClass().getName());
    }
}
