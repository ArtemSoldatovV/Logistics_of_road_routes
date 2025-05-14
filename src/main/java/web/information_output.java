package web;

import org.example.logistics_of_road_routes.Constants;
import org.springframework.web.bind.annotation.GetMapping;

public class information_output {
    @GetMapping("/api/number")
    public int gefNumberWer() {
        // Здесь вы можете генерировать или получать число
        return (int) (Math.random() * 100); // Пример: случайное число от 0 до 99
    }
}
