package letscode.boot3.controller.user;

import letscode.boot3.domain.user.User;
import letscode.boot3.dto.user.request.UserCreateRequest;
import letscode.boot3.dto.user.response.UserResponse;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    // 유저는 여러명이니 이것을 담을 List형태의 변수를 만들어줌
    //private final List<User> users = new ArrayList<>();

    // 이제 메모리말고 디스크에 연결하기 위해 jdbcTemplate를 선언
    private final JdbcTemplate jdbcTemplate;

    public UserController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostMapping("/user")
    public void saveUser(@RequestBody UserCreateRequest request) {
        String sql = "INSERT INTO user(name, age) VALUES (?, ?)";
        jdbcTemplate.update(sql, request.getName(), request.getAge());
    }

    @GetMapping("/user")
    public List<UserResponse> getUsers() {
        return null;
    }
  
}