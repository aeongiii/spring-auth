package com.sparta.springauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordConfig {

    @Bean
    public PasswordEncoder passwordEncoder() { // passwordEncoder는 interface이므로 안에 구현체 저장
        return new BCryptPasswordEncoder(); // 비밀번호를 암호화하는 해시 함수
    }
}