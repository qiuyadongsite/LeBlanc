package com.qyd.play.designRule.Demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qiuyd on 2020/2/16.
 */
public class TeamLeader {

    public void commandCheckNumber(Employee employee){
        employee.checkNumberOfCourses();
    }
}
