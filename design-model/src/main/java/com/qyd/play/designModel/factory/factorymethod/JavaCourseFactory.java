package com.qyd.play.designModel.factory.factorymethod;


import com.qyd.play.designModel.factory.*;

/**
 * Created by qyd.
 */
public class JavaCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}
