package web.controller;

import entity.Road;
import entity.RoadDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.RoadService;
import org.example.logistics_of_road_routes.Constants;

import java.util.List;

@RestController
@RequestMapping("/graph_menu/road/{roadId}")
public class RoadController {
    @Autowired
    private RoadService roadService;

    @PostMapping
    public ResponseEntity<Road> createProduct(@RequestBody Road road) {
        Road newProduct = roadService.save(road);
        return ResponseEntity.status(HttpStatus.CREATED).body(newProduct);
    }

    @GetMapping("/{roadId}")
    public ResponseEntity<RoadDTO> getProductById(@PathVariable Long roadId) {
        return roadService.findById(roadId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<RoadDTO>> getAllProducts() {
        List<RoadDTO> products = roadService.findAll();
        return ResponseEntity.ok(products);
    }

    @DeleteMapping("/{Roadid}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
        roadService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{Roadid}")
    public ResponseEntity<Road> updateOrder(@PathVariable Long id, @RequestBody Road road) {
        Road updatedProduct = roadService.update(id, road);
        return ResponseEntity.ok(updatedProduct);
    }

}
