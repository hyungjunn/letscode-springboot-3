package letscode.boot3.controller;

import letscode.boot3.dto.request.CalculatorRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // 입구
public class CalculatorController {

    @GetMapping("/minus") // HTTP method, path
    public int addTwoNumber(CalculatorRequest request) { // 쿼리
        return request.getNumber1() - request.getNumber2(); // 반환값
    }

    @PostMapping("/divide")
    public int divideTwoNumber(@RequestBody CalculatorRequest request) {
        return request.getNumber1() / request.getNumber2();
    }
}
