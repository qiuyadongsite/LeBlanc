package com.qyd.play.designModel.mediator1.general;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 16:18
 * @Description:
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
