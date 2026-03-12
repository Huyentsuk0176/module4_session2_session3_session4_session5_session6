package com.example.employee_api.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ViettelPhoneValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

public @interface ViettelPhone {

    String message() default "Phone number must be a valid Viettel phone number";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}