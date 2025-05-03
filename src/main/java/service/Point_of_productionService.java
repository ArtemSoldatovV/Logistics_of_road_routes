package service;

import repository.Point_of_productionRepository;
import org.example.logistics_of_road_routes.MappingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Point_of_productionService {
    @Autowired
    private Point_of_productionRepository userRepository;
    @Autowired
    private MappingUtils mappingUtils;
}