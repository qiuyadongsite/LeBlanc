package com.qyd.play.designModel.mediator1.general;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 16:19
 * @Description:
 */
public class ConcreteColleageB extends Colleague{
    public ConcreteColleageB(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod(String msg){
        System.out.println("b self method:"+msg);
    }
    public void depMethodA(String msg){
        System.out.println("depMethodA:"+msg);
        this.mediator.transToA(msg);
    }
}
