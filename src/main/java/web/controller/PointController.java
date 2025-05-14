package web.controller;

import entity.Point;
import entity.PointDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.PointService;
import service.Point_of_productionService;
import service.Point_of_saleService;
import org.example.logistics_of_road_routes.Constants;

import java.util.List;

@RestController
@RequestMapping("/graph_menu/point/{pointId}")
public class PointController {
    @Autowired
    private PointService pointService;
//    @Autowired
//    private Point_of_productionService point_of_productionService;
//    @Autowired
//    private Point_of_saleService point_of_saleService;

    @PostMapping
    public ResponseEntity<Point> createProduct(@RequestBody Point point) {
        Point newProduct = pointService.save(point);
        return ResponseEntity.status(HttpStatus.CREATED).body(newProduct);
    }

    @GetMapping("/{pointId}")
    public ResponseEntity<PointDTO> getProductById(@PathVariable Long pointId) {
        return pointService.findById(pointId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<PointDTO>> getAllProducts() {
        List<PointDTO> products = pointService.findAll();
        return ResponseEntity.ok(products);
    }

    @DeleteMapping("/{Pointid}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
        pointService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{Pointid}")
    public ResponseEntity<Point> updateOrder(@PathVariable Long id, @RequestBody Point point) {
        Point updatedProduct = pointService.update(id, point);
        return ResponseEntity.ok(updatedProduct);
    }

}
