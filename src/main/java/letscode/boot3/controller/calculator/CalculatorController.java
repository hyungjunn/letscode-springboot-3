package letscode.boot3.controller.calculator;

import letscode.boot3.dto.calculator.request.CalculatorRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController // 입구
public class CalculatorController {

    @GetMapping("/add")
    public int addTwoNumber(CalculatorRequest request) {
        return request.getNumber1() + request.getNumber2();
    }

    @GetMapping("/minus") // HTTP method, path
    public int minusTwoNumber(CalculatorRequest request) { // 쿼리
        return request.getNumber1() - request.getNumber2(); // 반환값
    }

    @PostMapping("/divide")
    public int divideTwoNumber(@RequestBody CalculatorRequest request) {
        return request.getNumber1() / request.getNumber2();
    }
}
