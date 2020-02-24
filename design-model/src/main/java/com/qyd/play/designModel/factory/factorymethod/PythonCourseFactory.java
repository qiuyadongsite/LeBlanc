package com.qyd.play.designModel.factory.factorymethod;


import com.qyd.play.designModel.factory.ICourse;
import com.qyd.play.designModel.factory.PythonCourse;

/**
 * Created by qiuyd.
 */
public class PythonCourseFactory implements ICourseFactory {

    public ICourse create() {
        return new PythonCourse();
    }
}
