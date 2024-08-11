package com.ejemplo.biblioteca.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

public interface SeguridaConfig {
    void configure(AuthenticationManagerBuilder auth) throws Exception;
}
