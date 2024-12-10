package com.sparta.springauth.food;

public interface Food {
    void eat();
}

// food 인터페이스를 실제 구현한 구현체 chicken, pizza를 빈으로 등록하면,
// food 클래스에도 커피콩모양이 보인다. Food 인터페이스를 사용한 빈이 등록되었다는 의미
// 등록 자체는 문제가 없다.