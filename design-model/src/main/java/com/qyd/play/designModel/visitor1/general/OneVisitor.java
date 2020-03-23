package com.qyd.play.designModel.visitor1.general;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 14:29
 * @Description:
 */
public class OneVisitor implements IVisitor {
    @Override
    public void visit(OneDataConstruction oneDataConstruction) {
        System.out.println(oneDataConstruction.getCount());
        System.out.println("one Visitor visit"+oneDataConstruction.getClass().getName());
    }

    @Override
    public void visit(OtherDataConstruction otherDataConstruction) {
        System.out.println(otherDataConstruction.getCount());
        System.out.println("one Visitor visit"+otherDataConstruction.getClass().getName());
    }
}
