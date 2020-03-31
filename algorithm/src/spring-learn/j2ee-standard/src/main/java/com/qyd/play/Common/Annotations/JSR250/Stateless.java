package com.qyd.play.Common.Annotations.JSR250;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

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
public @interface Stateless {
    String value() default "";

}
