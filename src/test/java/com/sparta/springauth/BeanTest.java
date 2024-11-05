package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest // bean 주입받아 DI 사용 가능하도록
public class BeanTest {

    @Autowired // @Autowired는 기본적으로 Food타입의 Bean을 찾는데, Food타입이 두개 이상이라면 오류 발생
                // 해결 1) Bean의 이름을 직접 명시한다. Food chicken;
                // 해결 2) 우선적으로 적용하고싶은 Bean 클래스에 @primary 붙인다.
                // 해결 3) 적용하고싶은 클래스와 테스트 클래스에 @Qualifier("이름")을 붙인다. (이름)이 같아야 한다.
                // * Primary 보다 Qualifier의 우선순위가 더 높다.
                // 따라서 범용적으로 사용되면 Primary를, 지역적으로 사용되면 Qualifier를 붙인다.
    @Qualifier("pizza")

    Food food;


    @Test
    @DisplayName("테스트")
    // public같은거 안 넣어도 된다.
    void test1() {
        food.eat();
    }

}
