package com.qyd.play.designModel.factory.abstractfactory;

/**
 * Created by qiuyd.
 */
public class JavaCourseFactory implements CourseFactory {

    public INote createNote() {
        return new JavaNote();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }
}
