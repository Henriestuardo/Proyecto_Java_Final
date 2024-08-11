package com.ejemplo.biblioteca.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.authentication.AuthenticationManager;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SeguridadConfig extends WebSecurityConfigurerAdapter{

    // Define el codificador de contraseñas.
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // Define el AuthenticationManager con autenticación en memoria.
    @Bean
    public AuthenticationManager authenticationManager(HttpSecurity http, AuthenticationConfiguration authConfig) throws Exception {
        AuthenticationManagerBuilder authenticationManagerBuilder =
                new AuthenticationManagerBuilder((ObjectPostProcessor<Object>) http.getSharedObject(DataSource.class));
        authenticationManagerBuilder
                .inMemoryAuthentication()
                .withUser("user")
                .password(passwordEncoder().encode("password"))
                .roles("USER")
                .and()
                .withUser("root")
                .password(passwordEncoder().encode("rootpassword"))
                .roles("ROOT");
        return authenticationManagerBuilder.build();
    }
}