package com.qyd.play.designRule.simpleresponsibility.interfaced;

/**
 * Created by qiuyd on 2020/2/16.
 */
public interface ICourse {

    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();
}
