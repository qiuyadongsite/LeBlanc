package com.qyd.play.designModel.factory.abstractfactory;

/**
 * Created by qiuyd.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        JavaCourseFactory factory = new JavaCourseFactory();

        factory.createNote().edit();
        factory.createVideo().record();

    }

}
