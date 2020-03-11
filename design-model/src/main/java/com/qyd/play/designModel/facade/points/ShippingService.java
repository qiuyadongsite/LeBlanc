package com.qyd.play.designModel.facade.points;

/**
 * Created by qyd.
 */
public class ShippingService {
    public String delivery(GiftInfo giftInfo){
        System.out.println(giftInfo.getName() + "进入物流系统");
        String shippingNo = "666";
        return shippingNo;
    }
}
