package com.qyd.play.Bean.Validation.JSR303;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Auther: qiuyd
 * @Date: 2020/3/27 15:38
 * @Description:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER })
@Constraint(validatedBy = { NotEmpty.NotNullValidator.class })
public @interface NotEmpty {
    String field() default "";
    String message() default "";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    class NotNullValidator implements ConstraintValidator<NotEmpty, Object> {

        @Override
        public void initialize(NotEmpty annotation) {
        }

        @Override
        public boolean isValid(Object str, ConstraintValidatorContext constraintValidatorContext) {
            return str != null;
        }
    }

}

