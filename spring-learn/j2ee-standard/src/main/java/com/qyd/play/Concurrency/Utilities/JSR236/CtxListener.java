package com.qyd.play.Concurrency.Utilities.JSR236;

import javax.annotation.Resource;
import javax.enterprise.concurrent.ManagedScheduledExecutorService;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/26 19:39
 * @Description:
 */
public class CtxListener implements ServletContextListener {
    Future loggerHandle = null;
    @Resource(name = "concurrent/ScheduledLoggerExecutor")
    ManagedScheduledExecutorService mes;

    @Override
    public void contextInitialized(ServletContextEvent scEvent) {
        LoggerTimer logger = new LoggerTimer();
        loggerHandle = mes.scheduleAtFixedRate(
                logger, 5, 5000, TimeUnit.SECONDS);

    }
    @Override
    public void contextDestroyed (ServletContextEvent scEvent){
// Cancel and interrupt our logger task
        if (loggerHandle != null) {
            loggerHandle.cancel(true);
        }
    }
}
