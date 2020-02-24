package com.qyd.play.designModel.factory.factorymethod;


import com.qyd.play.designModel.factory.ICourse;
import com.qyd.play.designModel.factory.JavaCourse;

/**
 * Created by qiuyd.
 */
public class JavaCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}
