package com.qyd.play.controller;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import com.qyd.play.annotation.QydAutowired;
import com.qyd.play.annotation.QydController;
import com.qyd.play.annotation.QydQueryParam;
import com.qyd.play.annotation.QydRequestMapping;
import com.qyd.play.service.UserService;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

    //Rrror>Warn>Info>Debug>Trace
    Logger logger=LoggerFactory.getLogger(DemoController.class);

    @QydAutowired
    private UserService userService;

    @QydRequestMapping("/query")
    public void query(@QydQueryParam String name, HttpServletRequest request, HttpServletResponse response){
        String msg=userService.getName(name);
        logger.info("info-query:name="+name);
        logger.error("error-query:name="+name);
        logger.debug("debug-query:name="+name);
        logger.warn("warn-query:name="+name);
        logger.trace("trace-query:name="+name);

        LoggerContext loggerContext= (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(loggerContext);
        try {
            response.getWriter().write(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
