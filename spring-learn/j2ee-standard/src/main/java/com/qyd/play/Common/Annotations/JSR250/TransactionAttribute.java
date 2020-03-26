package com.qyd.play.Common.Annotations.JSR250;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/26 15:40
 * @Description:
 */
@Documented
@Retention(RUNTIME)
@Target({TYPE,METHOD,FIELD,PARAMETER})
public @interface TransactionAttribute {

    String NEVER="NEVER";
    String REQUIRED="REQUIRED";
    String REQUIRES_NEW="REQUIRES_NEW";

    String value() default NEVER;

}
