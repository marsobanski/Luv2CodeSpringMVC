package com.luv2code.springdemo.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidation.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    //default course code
    String value() default "LUV";
    //message if doesnt't pass
    String message() default "must start with LUV";
    //default groups
    Class<?>[] groups() default {};
    //default payloads
    Class<? extends Payload>[] payload() default {};
}
