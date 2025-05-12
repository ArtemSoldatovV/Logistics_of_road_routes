package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CarService;

@RestController
@RequestMapping("/graph_menu/car/{cartId}")
public class CarController {
    @Autowired
    private CarService carService;
}
