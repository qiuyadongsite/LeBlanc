package com.qyd.play.Bean.Validation.JSR303;

import org.springframework.beans.factory.annotation.Value;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/27 15:18
 * @Description:
 */
public class ApplicationConfig {

    @Value("cyd.NotEmpty.message")
    public  static String NotEmpty;
}
