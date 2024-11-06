package com.sparta.springauth.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "users") // 클래스 이름 'User'가 아닌, 지정한 이름 'users'로 테이블 만들어짐
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    // @Enumerated : enum 타입의 데이터(User, Admin)를 DB 컬럼에 넣음
    @Enumerated(value = EnumType.STRING)
    private UserRoleEnum role;

    // id는 자동 증가이므로 제외하고 나머지 넣어주기.
    public User(String username, String password, String email, UserRoleEnum role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }
}