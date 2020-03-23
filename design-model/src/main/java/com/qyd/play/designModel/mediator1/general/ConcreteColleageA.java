package com.qyd.play.designModel.mediator1.general;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 16:19
 * @Description:
 */
public class ConcreteColleageA extends Colleague{
    public ConcreteColleageA(Mediator mediator) {
        super(mediator);
    }
    public void selfMethod(String msg){
        System.out.println("a self method:"+msg);
    }
    public void depMethodB(String msg){
        System.out.println("depMethodB:"+msg);
        this.mediator.transToB(msg);
    }
}
