package site.metacoding.blogv2.web;

import org.springframework.stereotype.Controller;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.GetMapping;
=======
>>>>>>> 031aa1bb7dc4a1835b23e60adc1234f46b985f72

import lombok.RequiredArgsConstructor;
import site.metacoding.blogv2.service.UserService;

@RequiredArgsConstructor
@Controller
public class UserController {
    private final UserService userService;
<<<<<<< HEAD

    // 웹브라우저 -> 회원가입 페이지 주세요!!
    // 앱 -> 회원가입 페이지 주세요!! 말이 안 됨!!
    @GetMapping("/joinForm")
    public String joinForm() {
        return "user/joinForm";
    }

    @GetMapping("/loginForm")
    public String loginForm() {
        return "user/loginForm";
    }
=======
>>>>>>> 031aa1bb7dc4a1835b23e60adc1234f46b985f72
}