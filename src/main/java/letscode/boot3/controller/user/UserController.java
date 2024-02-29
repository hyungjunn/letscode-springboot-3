package letscode.boot3.controller.user;

import letscode.boot3.dto.user.request.UserCreateRequest;
import letscode.boot3.dto.user.request.UserUpdateRequest;
import letscode.boot3.dto.user.response.UserResponse;
import letscode.boot3.service.UserService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    // 유저는 여러명이니 이것을 담을 List형태의 변수를 만들어줌
    //private final List<User> users = new ArrayList<>();

    // 이제 메모리말고 디스크에 연결하기 위해 jdbcTemplate를 선언
    private final UserService userService;

    public UserController(JdbcTemplate jdbcTemplate) {
        this.userService = new UserService(jdbcTemplate);
    }

    @PostMapping("/user")
    public void saveUser(@RequestBody UserCreateRequest request) {
        userService.saveUser(request);
    }

    @GetMapping("/user")
    public List<UserResponse> getUsers() {
        return userService.getUser();
    }

    @PutMapping("/user") // 업데이트
    public void updateUser(@RequestBody UserUpdateRequest request) {
        userService.updateUser(request);
    }

    @DeleteMapping("/user") // 삭제
    public void deleteUser(@RequestParam String name) {
        userService.deleteUser(name);
    }
  
}