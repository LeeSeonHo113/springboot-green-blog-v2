package site.metacoding.blogv2.web;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.RequiredArgsConstructor;
import site.metacoding.blogv2.domain.user.User;
import site.metacoding.blogv2.service.UserService;

@RequiredArgsConstructor
@Controller
public class UserController {
    private final UserService userService;
    private final HttpSession session;

    // @GetMapping("/logout")
    // public String logout() {
    // session.invalidate(); // 세션 무효화(세션 아이디 영역의 데이터를 다 삭제해)
    // return "redirect:/";
    // }

    // 웹브라우저 -> 회원가입 페이지 주세요!!
    // 앱 -> 회원가입 페이지 주세요!! 말이 안됨!!
    @GetMapping("/joinForm")
    public String joinForm() {
        return "user/joinForm";
    }

    @GetMapping("/loginForm")
    public String loginForm(HttpServletRequest request, Model model) {
        if (request.getCookies() != null) {
            Cookie[] cookies = request.getCookies(); // jSessionId, remember 두개가 있음.

            for (Cookie cookie : cookies) {
                System.out.println("쿠키값 : " + cookie.getName());
                if (cookie.getName().equals("remember")) {
                    model.addAttribute("remember", cookie.getValue());
                }
            }
        }

        return "user/loginForm";
    }
}