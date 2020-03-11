package com.qyd.play.designModel.factory.abstractfactory;


import com.qyd.play.designModel.factory.INote;
import com.qyd.play.designModel.factory.IVideo;
import com.qyd.play.designModel.factory.JavaNote;
import com.qyd.play.designModel.factory.JavaVideo;

/**
 * Created by qyd.
 */
public class JavaCourseFactory extends CourseFactory {

    public INote createNote() {
        super.init();
        return new JavaNote();
    }

    public IVideo createVideo() {
        super.init();
        return new JavaVideo();
    }
}
