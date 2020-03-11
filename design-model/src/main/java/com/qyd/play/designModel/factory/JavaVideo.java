package com.qyd.play.designModel.factory;


import com.qyd.play.designModel.factory.IVideo;

/**
 * Created by qyd.on.
 */
public class JavaVideo implements IVideo {
    public void record() {
        System.out.println("录制Java视频");
    }
}
