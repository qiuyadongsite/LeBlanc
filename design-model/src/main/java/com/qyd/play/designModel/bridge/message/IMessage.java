package com.qyd.play.designModel.bridge.message;

/**
 * Created by qyd.
 */
public interface IMessage {
    //发送消息的内容和接收人
    void send(String message, String toUser);
}
