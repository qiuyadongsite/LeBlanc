package com.qyd.play.designModel.factory;

import com.qyd.play.designModel.factory.IVideo;

/**
 * Created by qyd.
 */
public class PythonVideo implements IVideo {
    public void record() {
        System.out.println("录制Python视频");
    }
}
