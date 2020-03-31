package com.qyd.play;

import org.springframework.context.ApplicationEvent;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/31 19:22
 * @Description:
 */
public class EventContext extends ApplicationEvent {
    private String name;

    public EventContext(Object source) {
        super(source);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
