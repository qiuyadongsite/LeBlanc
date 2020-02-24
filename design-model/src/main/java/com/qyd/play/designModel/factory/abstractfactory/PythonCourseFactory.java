package com.qyd.play.designModel.factory.abstractfactory;

/**
 * Created by qiuyd.
 */
public class PythonCourseFactory implements CourseFactory {

    public INote createNote() {
        return new PythonNote();
    }


    public IVideo createVideo() {
        return new PythonVideo();
    }
}
