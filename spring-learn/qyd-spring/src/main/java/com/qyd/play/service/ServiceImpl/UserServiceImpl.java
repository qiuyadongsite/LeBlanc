package com.qyd.play.service.ServiceImpl;

import com.qyd.play.annotation.QydService;
import com.qyd.play.service.UserService;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/30 09:26
 * @Description:
 */
@QydService
public class UserServiceImpl implements UserService {
    @Override
    public String getName(String name) {
        return "hello name:"+name;
    }
}
