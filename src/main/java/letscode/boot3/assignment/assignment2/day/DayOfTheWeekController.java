package letscode.boot3.assignment.assignment2.day;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class DayOfTheWeekController {

    @GetMapping("/api/v1/day-of-the-week")
    public Day dayOfTheWeek(@RequestParam LocalDate date) {
        return new Day(date);
    }
}
