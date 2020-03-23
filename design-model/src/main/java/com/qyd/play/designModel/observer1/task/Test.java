package com.qyd.play.designModel.observer1.task;

import com.google.common.eventbus.EventBus;

import java.util.UUID;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 15:34
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        EventBus eventBus=new EventBus();
        Student zhangsan=new Student(UUID.randomUUID().toString(),"张三");
        Tom tom=new Tom();
        Jerry jerry=new Jerry();
        Question question=new Question("spring","spring用到哪些设计模式？");
        eventBus.register(new SubmitQuestionService(zhangsan));
        eventBus.register(tom);
        eventBus.register(jerry);
        eventBus.post(question);
    }
}
