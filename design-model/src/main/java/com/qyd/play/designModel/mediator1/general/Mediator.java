package com.qyd.play.designModel.mediator1.general;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 16:17
 * @Description:
 */
public abstract class Mediator {
    private ConcreteColleageA concreteColleageA;
    private ConcreteColleageB concreteColleageB;

    public ConcreteColleageA getConcreteColleageA() {
        return concreteColleageA;
    }

    public void setConcreteColleageA(ConcreteColleageA concreteColleageA) {
        this.concreteColleageA = concreteColleageA;
    }

    public ConcreteColleageB getConcreteColleageB() {
        return concreteColleageB;
    }

    public void setConcreteColleageB(ConcreteColleageB concreteColleageB) {
        this.concreteColleageB = concreteColleageB;
    }

    public abstract void transToA(String msg);
    public abstract void transToB(String msg);
}
