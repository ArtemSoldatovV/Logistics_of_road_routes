package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PointService;
import service.Point_of_productionService;
import service.Point_of_saleService;

@RestController
@RequestMapping("/graph_menu/point/{pointId}")
public class PointController {
    @Autowired
    private PointService pointService;
    @Autowired
    private Point_of_productionService point_of_productionService;
    @Autowired
    private Point_of_saleService point_of_saleService;

}
