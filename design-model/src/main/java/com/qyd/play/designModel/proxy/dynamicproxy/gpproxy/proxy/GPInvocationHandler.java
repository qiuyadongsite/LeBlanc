package com.qyd.play.designModel.proxy.dynamicproxy.gpproxy.proxy;

import java.lang.reflect.Method;

/**
 * Created by qyd.on 2019/3/10.
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
