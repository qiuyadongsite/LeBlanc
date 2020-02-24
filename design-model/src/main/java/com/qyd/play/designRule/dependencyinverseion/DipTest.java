package com.qyd.play.designRule.dependencyinverseion;

/**
 * Created by qiuyd on 2020/2/16.
 */
public class DipTest {

    public static void main(String[] args) {
        //=====  V1  ========
//        qiuyd qiuyd = new qiuyd();
//        qiuyd.studyJavaCourse();
//        qiuyd.studyPythonCourse();
//        qiuyd.studyAICourse();


        //=====  V2  ========
//        qiuyd qiuyd = new qiuyd();
//        qiuyd.study(new JavaCourse());
//        qiuyd.study(new PythonCourse());


        //=====  V3  ========
//        qiuyd qiuyd = new qiuyd(new JavaCourse());
//        qiuyd.study();


        //=====  V4  ========
        qiuyd qiuyd = new qiuyd();
        qiuyd.setiCourse(new JavaCourse());
        qiuyd.study();
    }
}
