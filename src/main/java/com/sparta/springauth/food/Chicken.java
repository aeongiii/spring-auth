package com.sparta.springauth.food;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // Chicken을 Bean으로 등록
@Primary // 같은 타입의 빈이 여러개 충돌하더라도 우선적으로 적용
public class Chicken implements Food {
    @Override
    public void eat() {
        System.out.println("치킨을 먹습니다.");
    }
}