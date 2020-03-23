package com.qyd.play.designModel.observer1.general;



/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 10:36
 * @Description:具体主题
 */
public class ConcreteSubject extends ISubject {
    public void triggerSome(Object o){
        System.out.println("具体处理某事情："+o.toString());
        this.trigger(o);
    }
}
