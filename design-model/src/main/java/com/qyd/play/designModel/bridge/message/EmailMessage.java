package com.qyd.play.designModel.bridge.message;

/**
 * Created by qyd.
 */
public class EmailMessage implements IMessage {
    public void send(String message, String toUser) {
        System.out.println("使用邮件消息发送" + message + "给" + toUser);
    }
}
