package site.metacoding.blogv2.web.api;

<<<<<<< HEAD
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
=======
>>>>>>> 031aa1bb7dc4a1835b23e60adc1234f46b985f72
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.blogv2.service.UserService;
<<<<<<< HEAD
import site.metacoding.blogv2.web.api.dto.ResponseDto;
import site.metacoding.blogv2.web.api.dto.user.JoinDto;
=======
>>>>>>> 031aa1bb7dc4a1835b23e60adc1234f46b985f72

@RequiredArgsConstructor
@RestController
public class UserApiController {
    private final UserService userService;
<<<<<<< HEAD

    @PostMapping("/api/join")
    public ResponseDto<String> join(@RequestBody JoinDto joinDto) {

        userService.회원가입(joinDto);

        return new ResponseDto<String>(1, "회원가입 성공", null);
    }
=======
>>>>>>> 031aa1bb7dc4a1835b23e60adc1234f46b985f72
}