package letscode.boot3.controller.calculator;

import letscode.boot3.dto.calculator.request.CalculatorAddRequest;
import letscode.boot3.dto.calculator.request.CalculatorMultiplyRequest;
import letscode.boot3.dto.calculator.request.CalculatorSubRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // api 입구
public class CalculatorController {

    @GetMapping("/add") // HTTP method, HTTP PATH
    public int addTwoNumbers(CalculatorAddRequest request) {
        return request.number1() + request.number2();
    }

    @GetMapping("/sub") // HTTP method, HTTP PATH
    public int subTwoNumbers(CalculatorSubRequest request) {
        return request.number1() - request.number2();
    }

    @PostMapping("/multiply")
    public int multiply(CalculatorMultiplyRequest request) {
        return request.number1() * request.number2();
    }
}
