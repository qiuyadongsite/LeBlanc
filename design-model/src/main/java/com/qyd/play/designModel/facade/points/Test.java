package com.qyd.play.designModel.facade.points;

import com.qyd.play.designModel.facade.general.Facade;

/**
 * Created by qyd.
 */
public class Test {

    public static void main(String[] args) {

        FacadeService facadeService = new FacadeService();

        GiftInfo giftInfo = new GiftInfo("《Spring 5核心原理》");

        facadeService.exchange(giftInfo);

    }

}
