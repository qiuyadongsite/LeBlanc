package com.qyd.play.designModel.adapter.demo.passport.adapterv2;

import com.qyd.play.designModel.adapter.demo.passport.adapterv2.IPassportForThird;
import com.qyd.play.designModel.adapter.demo.passport.adapterv2.PassportForThirdAdapter;

/**
 * Created by qyd.
 */
public class Test {
    public static void main(String[] args) {
        IPassportForThird adapter = new PassportForThirdAdapter();
        adapter.loginForQQ("sdfasdfasfasfas");
    }
}
