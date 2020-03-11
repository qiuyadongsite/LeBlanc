package com.qyd.play.designModel.factory.simplefactory;


import com.qyd.play.designModel.factory.ICourse;
import com.qyd.play.designModel.factory.JavaCourse;

/**
 * 小作坊式的工厂模型
 * Created by qyd.
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

//        ICourse course = new JavaCourse();
//        course.record();

//        ICourseFactory factory = new ICourseFactory();
//        ICourse course = factory.create("com.qyd.play.designModel.factory.JavaCourse");
//        course.record();

        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create(JavaCourse.class);
        course.record();

    }
}
