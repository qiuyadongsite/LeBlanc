package com.qyd.play.designModel.observer1.task;

import com.google.common.eventbus.Subscribe;
import lombok.Data;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 15:23
 * @Description:
 */
@Data
public class Student {
    private String id;
    private String name;
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
