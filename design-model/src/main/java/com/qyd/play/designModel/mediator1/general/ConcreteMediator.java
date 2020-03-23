package com.qyd.play.designModel.mediator1.general;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 16:21
 * @Description:
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void transToA(String msg) {
        this.getConcreteColleageA().selfMethod(msg);
    }

    @Override
    public void transToB(String msg) {
        this.getConcreteColleageB().selfMethod(msg);
    }
}
