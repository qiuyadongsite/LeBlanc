package com.qyd.play.designModel.observer1.task;

import com.google.common.eventbus.Subscribe;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 15:27
 * @Description:
 */
public class SubmitQuestionService {

    private Student student;

    public SubmitQuestionService(Student student) {
        this.student = student;
    }

    @Subscribe
    public void submitQuestion(Question question){
        question.setUserId(student.getId());
        System.out.println(student.getName()+"提出了问题："+question);
    }
}
