package com.qyd.play.designModel.factory.factorymethod;


import com.qyd.play.designModel.factory.ICourse;

/**
 * Created by qyd.
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();

        factory = new JavaCourseFactory();
        course = factory.create();
        course.record();

    }

}
