package com.qyd.play.designRule.LiskovSubstiution;

/**
 * Created by qiuyd on 2020/2/16.
 */
public class Square implements QuadRangle {
    private long length;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public long getWidth() {
        return length;
    }

    public long getHeight() {
        return length;
    }
}
