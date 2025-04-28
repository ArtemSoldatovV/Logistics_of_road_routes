package web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        // Логика аутентификации
        if (isValidUser(loginRequest)) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed");
        }
    }

    private boolean isValidUser(LoginRequest loginRequest) {
        // Ваша логика проверки пользователя
        return "user".equals(loginRequest.getUsername()) && "password".equals(loginRequest.getPassword());
    }
}