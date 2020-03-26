package com.qyd.play.Common.Annotations.JSR250;

import javax.annotation.security.RolesAllowed;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/26 17:21
 * @Description:
 */
@RolesAllowed({"Users"})
public class RolesAllowedTest {
    @RolesAllowed("Administrator")
    public void setNewRate(int rate) {
        //...
    }
}
