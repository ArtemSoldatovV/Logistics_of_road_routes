package web.error;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

@ControllerAdvice(annotations = RestController.class)
public class Central_error_handler implements ErrorController {
    @ExceptionHandler(HttpClientErrorException.NotFound.class)
    public String handleNotFound(Model model)
    {
        model.addAttribute("title", "Страница не найдена.");
        model.addAttribute("message", "Страница, которую вы ищете не существует.");
        return "errors/error-custom";
    }
}
