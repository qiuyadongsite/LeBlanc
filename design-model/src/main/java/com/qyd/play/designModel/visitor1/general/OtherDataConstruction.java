package com.qyd.play.designModel.visitor1.general;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 14:24
 * @Description:
 */
public class OtherDataConstruction implements DataConstruction {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    public int getCount(){
        return 2;
    }
}
