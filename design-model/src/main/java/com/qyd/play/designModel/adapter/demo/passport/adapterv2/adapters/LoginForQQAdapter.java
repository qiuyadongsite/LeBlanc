package com.qyd.play.designModel.adapter.demo.passport.adapterv2.adapters;

import com.qyd.play.designModel.adapter.demo.passport.PassportService;
import com.qyd.play.designModel.adapter.demo.passport.ResultMsg;

/**
 * Created by qyd.
 */
public class LoginForQQAdapter extends AbstraceAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        System.out.println("进入QQ登录验证");

        if(!support(adapter)){return null;}
        //accesseToken
        //time
        System.out.println("使用QQ登录");
        return super.loginForRegist(id,null);

    }

}
