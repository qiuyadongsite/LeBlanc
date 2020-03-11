package com.qyd.play.designModel.adapter.demo.passport.adapterv2.adapters;

import com.qyd.play.designModel.adapter.demo.passport.PassportService;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/11 17:02
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        ILoginAdapter p=new LoginForQQAdapter();
        p.login("123",p);
    }
}
