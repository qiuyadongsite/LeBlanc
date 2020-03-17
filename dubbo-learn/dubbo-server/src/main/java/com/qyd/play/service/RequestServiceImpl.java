package com.qyd.play.service;

import com.qyd.play.service.RequestService;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/17 15:00
 * @Description:
 */
public class RequestServiceImpl implements RequestService {
    @Override
    public String dealSome(String msg) {

        return "【接收到】"+msg+",并处理了！";
    }
}
