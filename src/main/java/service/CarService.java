package service;

import repository.CarRepository;
import org.example.logistics_of_road_routes.MappingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    @Autowired
    private CarRepository userRepository;
    @Autowired
    private MappingUtils mappingUtils;
}
