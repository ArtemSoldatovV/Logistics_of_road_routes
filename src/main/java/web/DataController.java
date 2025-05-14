package web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.example.logistics_of_road_routes.Constants;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DataController {

    @GetMapping("/api/data")
    public Map<String, String> getData() {
        Map<String, String> data = new HashMap<>();
        data.put("message", "Hello from the server!");
        return data;
    }
}