package com.qyd.play.designModel.factory.abstractfactory;

import com.qyd.play.designModel.factory.INote;
import com.qyd.play.designModel.factory.IVideo;
import com.qyd.play.designModel.factory.PythonNote;
import com.qyd.play.designModel.factory.PythonVideo;

/**
 * Created by qyd.
 */
public class PythonCourseFactory extends CourseFactory {

    public INote createNote() {
        super.init();
        return new PythonNote();
    }


    public IVideo createVideo() {
        super.init();
        return new PythonVideo();
    }
}
