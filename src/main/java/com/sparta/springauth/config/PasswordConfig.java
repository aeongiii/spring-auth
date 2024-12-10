package com.sparta.springauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration // 빈을 등록하는 메서드가 속한 해당 클래스에 @Configuration 붙임
public class PasswordConfig {

    @Bean
    public PasswordEncoder passwordEncoder() { // passwordEncoder(맨앞 소문자)로 빈 등록됨
        return new BCryptPasswordEncoder(); // passwordEncoder는 인터페이스이므로, 구현체 중 하나를 선택해야 한다.
                                            // BCryptPasswordEncoder를 선택해서 사용해보자.
                                            // BCrypt라는 해시함수를 사용해서 비밀번호를 인코딩해줌.
    }
}