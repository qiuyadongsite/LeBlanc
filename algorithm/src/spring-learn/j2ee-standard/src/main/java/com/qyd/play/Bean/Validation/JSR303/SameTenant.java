package com.qyd.play.Bean.Validation.JSR303;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/27 14:23
 * @Description:
 */



import org.apache.commons.lang3.StringUtils;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * uid是否属于当前上下文租户
 * 注：当被校验对象为空时，校验为通过，所以如果需要校验对象必填，请自行结合相关校验注解
 * Created by Zhang JinLong(150429) on 2016-09-18.
 */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {SameTenant.StringChecker.class, SameTenant.IntChecker.class})
@Documented
public @interface SameTenant {

    String message() default "{cyd.NotEmpty.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    class StringChecker implements ConstraintValidator<SameTenant, String> {

        @Override
        public void initialize(SameTenant arg0) {
        }

        @Override
        public boolean isValid(String uid, ConstraintValidatorContext context) {

            if (!StringUtils.isBlank(uid)) {

                return true;
            }
            return false;
        }
    }

    class IntChecker implements ConstraintValidator<SameTenant, Integer> {

        @Override
        public void initialize(SameTenant arg0) {
        }

        @Override
        public boolean isValid(Integer uid, ConstraintValidatorContext context) {
            if (uid>20) {
                return true;
            }
            return false;
        }
    }
}
