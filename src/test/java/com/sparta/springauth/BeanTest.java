package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest // 의존성 주입 사용 가능하도록
public class BeanTest {

    // 문제 : Food로는 자동주입(Autowired) 할 수 없다. Food 구현체가 하나가 아니라서
//    @Autowired Food food;

    // 방법 1 : 직접 주입할 구현체 이름을 명시한다.
//    @Autowired Food pizza;
//    @Autowired Food chicken;

    // 방법 2 : food로 주입하면 Pizza or Chicken 중 뭘 주입하느냐 오류 발생하지만,
            // 특정 구현체에 @Primary가 붙어있는 경우 우선 적용된다.
            // 여기서는 Chicken에 붙어있어서 치킨으로 들어감.
//    @Autowired Food food;

    // 방법 3 : Food food를 사용하되, @Qualifier를 사용한다.
        // food로 주입했기 때문에 충돌날 것 같지만, 실제로는 "pizza"로 이름된 내용을 찾아서 우선적으로 주입한다.
        // 실제 결과에서도 "피자를 먹습니다"로 나온다.
    @Qualifier("pizza")
    @Autowired Food food;


    // *** 그럼 @Primary와 @Qualifier 중 어떤게 더 우선순위가 높을까?
    // Qualifier의 우선순위가 더 높다. 그러나 Pizza 클래스와 실행 클래스 모두에 코드를 작성해야 하므로,
    // 범용적으로 사용하는 Bean 객체 ==> @Primary를 사용
    // 지역적으로만 사용하는 Bean 객체 ==> @Qualifier를 사용 (번거로움을 최소화)
    // 참고 : 스프링에서는 주로 "좁은 범위의 설정이 더 우선순위가 높다"

    @Test
    @DisplayName("테스트")
    void test1 () {

        // 방법 1
//        pizza.eat();
//        chicken.eat();

        // 방법 2
        food.eat();
    }

}
