package com.qyd.play.Common.Annotations.JSR250;

import javax.annotation.security.DeclareRoles;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/26 17:28
 * @Description:
 */
@DeclareRoles("BusinessAdmin")
public class DeclareRolesTest {
    public void convertCurrency(User x) {
        if(x.isUserInRole("BusinessAdmin")) {
//....
        }
    }
}

class User{
    public boolean isUserInRole(String x){
        return true;
    }
}

