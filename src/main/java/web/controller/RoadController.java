package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.RoadService;

@RestController
@RequestMapping("/graph_menu/road/{roadId}")
public class RoadController {
    @Autowired
    private RoadService roadService;
}
