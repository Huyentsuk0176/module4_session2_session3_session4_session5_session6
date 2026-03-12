package com.example.employee_api.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class ViettelPhoneValidator implements ConstraintValidator<ViettelPhone, String> {

    private static final List<String> VIETTEL_PREFIX = Arrays.asList(
            "086", "096", "097", "098", "032", "033", "034", "035", "036", "037", "038", "039"
    );

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        if (value == null) {
            return true;
        }

        for (String prefix : VIETTEL_PREFIX) {
            if (value.startsWith(prefix)) {
                return true;
            }
        }

        return false;
    }
}