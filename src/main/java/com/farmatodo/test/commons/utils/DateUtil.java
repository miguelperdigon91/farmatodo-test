package com.farmatodo.test.commons.utils;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DateUtil {

    public LocalDateTime now() {
        return LocalDateTime.now();
    }
}