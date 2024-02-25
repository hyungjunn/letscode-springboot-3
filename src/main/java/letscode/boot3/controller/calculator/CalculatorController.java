package letscode.boot3.controller.calculator;

import letscode.boot3.dto.calculator.request.CalculatorRequest;
import letscode.boot3.dto.calculator.response.CalculatorResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class CalculatorController {

    @GetMapping("/calc")
    public CalculatorResponse calculateTwoNumber(CalculatorRequest request) {
        return new CalculatorResponse(request);
    }
}
