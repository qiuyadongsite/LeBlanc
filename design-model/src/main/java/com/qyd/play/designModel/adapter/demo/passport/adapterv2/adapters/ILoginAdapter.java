package com.qyd.play.designModel.adapter.demo.passport.adapterv2.adapters;

import com.qyd.play.designModel.adapter.demo.passport.ResultMsg;

/**
 * Created by qyd.
 */
public interface ILoginAdapter {
    boolean support(Object object);
    ResultMsg login(String id, Object adapter);
}
