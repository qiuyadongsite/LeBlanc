package com.qyd.play.designRule.simpleresponsibility.simple;

/**
 * Created by qiuyd on 2020/2/16.
 */
public class Course {
    public  void study(String courseName){
        if("直播课".equals(courseName)){
            System.out.println("不能快进");
        }else{
            System.out.println("可以任意的来回播放");
        }
    }
}
