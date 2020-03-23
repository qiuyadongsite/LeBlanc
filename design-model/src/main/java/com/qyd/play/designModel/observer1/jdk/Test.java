package com.qyd.play.designModel.observer1.jdk;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 11:00
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Worker worker=new Worker();
        worker.addObserver(new Boss());
        worker.addObserver(new Manager());
        worker.doSomething("开发项目1！");
    }
}
