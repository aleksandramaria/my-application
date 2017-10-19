package com.crud.tasks.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by ola on 19/10/2017.
 */
@Component
@Getter
public class AdminConfig {
    @Value("${admin.mail}")
    private String adminMail;
}
