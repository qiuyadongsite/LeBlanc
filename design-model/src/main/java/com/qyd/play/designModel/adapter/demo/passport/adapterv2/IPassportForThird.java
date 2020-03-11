package com.qyd.play.designModel.adapter.demo.passport.adapterv2;

import com.qyd.play.designModel.adapter.demo.passport.ResultMsg;

/**
 * Created by qyd.
 */
public interface IPassportForThird {

    ResultMsg loginForQQ(String openId);

    ResultMsg loginForWechat(String openId);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelphone(String phone, String code);

}
