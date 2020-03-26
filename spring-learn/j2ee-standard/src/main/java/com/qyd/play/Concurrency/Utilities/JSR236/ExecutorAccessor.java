package com.qyd.play.Concurrency.Utilities.JSR236;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.enterprise.concurrent.ManagedThreadFactory;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/26 19:48
 * @Description:
 */
@Singleton
public class ExecutorAccessor {
    private ExecutorService threadPoolExecutor = null;
    @Resource(name="concurrent/ThreadFactory")
    ManagedThreadFactory threadFactory;
    @PostConstruct
    public void postConstruct() {
        threadPoolExecutor = new ThreadPoolExecutor(
                5, 10, 5, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(10), threadFactory);
    }
    public ExecutorService getThreadPool() {
        return threadPoolExecutor;
    }
}
