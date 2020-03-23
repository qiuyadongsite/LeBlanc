package com.qyd.play.designModel.visitor1.general;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 14:23
 * @Description:
 */
public interface IVisitor {

    void visit(OneDataConstruction oneDataConstruction);
    void visit(OtherDataConstruction otherDataConstruction);
}
