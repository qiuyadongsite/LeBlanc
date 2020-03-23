package com.qyd.play.designModel.mediator1.general;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 16:24
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator=new ConcreteMediator();
        ConcreteColleageA concreteColleageA=new ConcreteColleageA(concreteMediator);
        ConcreteColleageB concreteColleageB=new ConcreteColleageB(concreteMediator);
        concreteMediator.setConcreteColleageA(concreteColleageA);
        concreteMediator.setConcreteColleageB(concreteColleageB);
        concreteColleageA.depMethodB("test");
    }
}
