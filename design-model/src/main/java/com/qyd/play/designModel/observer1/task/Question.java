package com.qyd.play.designModel.observer1.task;

import lombok.Data;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 15:21
 * @Description:
 */
@Data
public class Question {
    private String userId;
    private String questionType;
    private String content;

    public Question(String questionType, String content) {
        this.questionType = questionType;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Question{" +
                "userId='" + userId + '\'' +
                ", questionType='" + questionType + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
