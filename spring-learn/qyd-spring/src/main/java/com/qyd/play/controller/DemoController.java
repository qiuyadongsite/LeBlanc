package com.qyd.play.controller;

import com.qyd.play.annotation.QydAutowired;
import com.qyd.play.annotation.QydController;
import com.qyd.play.annotation.QydQueryParam;
import com.qyd.play.annotation.QydRequestMapping;
import com.qyd.play.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/30 09:18
 * @Description:
 */
@QydController
@QydRequestMapping("/demo")
public class DemoController {

    @QydAutowired
    private UserService userService;

    @QydRequestMapping("/query")
    public void query(@QydQueryParam String name, HttpServletRequest request, HttpServletResponse response){
        String msg=userService.getName(name);
        try {
            response.getWriter().write(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
