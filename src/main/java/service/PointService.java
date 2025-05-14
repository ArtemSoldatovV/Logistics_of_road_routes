package service;

import entity.Point;
import entity.PointDTO;
import repository.PointRepository;
import org.example.logistics_of_road_routes.MappingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PointService {
    @Autowired
    private PointRepository pointRepository;
    @Autowired
    private MappingUtils mappingUtils;

    public Optional<PointDTO> findById(Long id) {
        return pointRepository.findById(id)
                .map(mappingUtils::mapToPointDTO);
    }

    public Point save(Point roas) {
        // Добавьте проверку валидности здесь
        return pointRepository.save(roas);
    }

    public List<PointDTO> findAll() {
        return pointRepository.findAll().stream()
                .map(mappingUtils::mapToPointDTO)
                .collect(Collectors.toList());
    }

    public Point update(Long id, Point pointDetails) {
        Optional<Point> optionalProduct = pointRepository.findById(id);

        Point point = optionalProduct.get();
        point.setId(pointDetails.getId());
        point.setName(pointDetails.getName());
        return pointRepository.save(point);
    }

    public void delete(Long id) {
        pointRepository.deleteById(id);
    }
}