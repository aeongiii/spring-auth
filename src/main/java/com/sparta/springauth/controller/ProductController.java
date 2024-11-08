package com.sparta.springauth.controller;

import com.sparta.springauth.entity.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//  /api/user로 시작되는 코드들을 검증하는 컨트롤러

@Controller
@RequestMapping("/api")
public class ProductController {

    @GetMapping("/products")
    public String getProducts(HttpServletRequest req) {
        System.out.println("ProductController.getProducts : 인증 완료");
        User user = (User) req.getAttribute("user"); // AuthFilter.doFilter에서 사용한 setAttribute를 get으로 가져옴
        System.out.println("user.getUsername() = " + user.getUsername());

        return "redirect:/";
    }
}