package com.qyd.play.designModel.visitor1.kpi;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 14:54
 * @Description:
 */
public class CFO implements Boss {
    @Override
    public void visit(Programmer programmer) {
        System.out.println("CFO:programmer");
        programmer.get();
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("CFO:manager");
        manager.get();
    }
}
