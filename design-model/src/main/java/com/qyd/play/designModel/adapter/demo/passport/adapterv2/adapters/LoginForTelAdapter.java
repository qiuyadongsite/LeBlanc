package com.qyd.play.designModel.adapter.demo.passport.adapterv2.adapters;

import com.qyd.play.designModel.adapter.demo.passport.ResultMsg;

/**
 * Created by qyd.
 */
public class LoginForTelAdapter extends AbstraceAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id,null);
    }

}
