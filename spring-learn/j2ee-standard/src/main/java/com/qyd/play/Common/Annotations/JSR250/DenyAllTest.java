package com.qyd.play.Common.Annotations.JSR250;

import javax.annotation.security.DenyAll;
import javax.annotation.security.RolesAllowed;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/26 17:25
 * @Description:
 */
@RolesAllowed("Users")
public class DenyAllTest {
    @RolesAllowed("Administrator")
    public void setNewRate(int rate) {
//...
    }
    @DenyAll
    public long convertCurrency(long amount) {
//...
        return 0;
    }
}
