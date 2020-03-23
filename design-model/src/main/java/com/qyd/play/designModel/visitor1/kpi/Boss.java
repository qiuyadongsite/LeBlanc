package com.qyd.play.designModel.visitor1.kpi;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 14:51
 * @Description:
 */
public interface Boss {
    public void visit(Programmer programmer);
    public void visit(Manager manager);
}
