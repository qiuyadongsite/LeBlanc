package com.qyd.play.designModel.delegate.simple;

/**
 * Created by Tom.
 */
public class Boss {
    public void command(String task,Leader leader){
        leader.doing(task);
    }
}
