package com.sparta.springauth;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class PasswordEncoderTest {

    @Autowired
    PasswordEncoder passwordEncoder; // @Autowired 사용해서 주입받기

    @Test
    @DisplayName("수동 등록한 passwordEncoder를 주입 받아와 문자열 암호화")
    void test1() {
        String password = "Robbie's password"; // 현재 패스워드

        // 암호화
        String encodePassword = passwordEncoder.encode(password); // 암호화할 문자열 넣기
        System.out.println("encodePassword = " + encodePassword); // 암호화 됐는지 확인

        String inputPassword = "Robbie"; // 패스워드랑 다른 문자열로 로그인할 경우

        // matches() : 복호화를 통해 암호화된 비밀번호와 비교하는 메서드
        // 파라미터 : 비밀번호랑 같은지 확인해야 할 문자열(평문) + 암호화된 진짜 패스워드
        // 동일하다면 t, 다르다면 f 반환
        boolean matches = passwordEncoder.matches(inputPassword, encodePassword);
        System.out.println("matches = " + matches); // 암호화할 때 사용된 값과 다른 문자열과 비교했기 때문에 false
    }
}