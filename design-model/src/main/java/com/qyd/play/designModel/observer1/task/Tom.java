package com.qyd.play.designModel.observer1.task;

import com.google.common.eventbus.Subscribe;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/23 15:29
 * @Description:
 */
public class Tom extends Teacher {
    public Tom() {
        setName("TOM");
    }
    @Subscribe
    public void getQuestion(Question question){
        System.out.println(this.getName()+":接受到了，问题："+question);
    }

}
