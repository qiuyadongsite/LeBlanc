package com.qyd.play.Common.Annotations.JSR250;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/26 17:23
 * @Description:
 */
@RolesAllowed("Users")
public class PermitAllTest {
    @RolesAllowed("Administrator")
    public void setNewRate(int rate) {
//...
    }
    @PermitAll
    public long convertCurrency(long amount) {
//...
        return 0;
    }
}
