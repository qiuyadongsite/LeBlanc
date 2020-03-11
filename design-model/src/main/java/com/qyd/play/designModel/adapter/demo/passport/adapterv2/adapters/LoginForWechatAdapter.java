package com.qyd.play.designModel.adapter.demo.passport.adapterv2.adapters;

import com.qyd.play.designModel.adapter.demo.passport.ResultMsg;

/**
 * Created by qyd.
 */
public class LoginForWechatAdapter extends AbstraceAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id,null);
    }


}
