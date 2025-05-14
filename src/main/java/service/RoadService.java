package service;

import entity.Car;
import entity.CarDTO;
import entity.Road;
import entity.RoadDTO;
import org.example.logistics_of_road_routes.MappingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RoadRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RoadService {
    @Autowired
    private RoadRepository roadRepository;
    @Autowired
    private MappingUtils mappingUtils;

    public Optional<RoadDTO> findById(Long id) {
        return roadRepository.findById(id)
                .map(mappingUtils::mapToRoadDTO);
    }

    public Road save(Road roas) {
        // Добавьте проверку валидности здесь
        return roadRepository.save(roas);
    }

    public List<RoadDTO> findAll() {
        return roadRepository.findAll().stream()
                .map(mappingUtils::mapToRoadDTO)
                .collect(Collectors.toList());
    }

    public Road update(Long id, Road roadDetails) {
        Optional<Road> optionalProduct = roadRepository.findById(id);

        Road road = optionalProduct.get();
        road.setName(roadDetails.getName());
        road.setScore_throughput_capacity(roadDetails.getScore_throughput_capacity());
        road.setPointt_1(roadDetails.getPointt_1());
        road.setPointt_2(roadDetails.getPointt_2());
        return roadRepository.save(road);

    }

    public void delete(Long id) {
        roadRepository.deleteById(id);
    }

}