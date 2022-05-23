package com.luv2code.springdemo.mvc.validation;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.ObjectUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

//implementuje ConstraintValidator z javax.validation
public class CourseCodeConstraintValidation implements ConstraintValidator<CourseCode, String> {

    @Getter
    @Setter
    private String coursePrefix;
    @Override
    public void initialize(CourseCode courseCode) {
        this.coursePrefix = courseCode.value();
    }

    //nadpisana metoda z ConstraintValidatora, zawiera logikę walidacji
    @Override
    public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {
        return !ObjectUtils.isEmpty(code) && code.startsWith(coursePrefix);
    }
}
