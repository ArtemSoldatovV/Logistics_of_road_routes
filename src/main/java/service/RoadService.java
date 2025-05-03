package service;

import org.example.logistics_of_road_routes.MappingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RoadRepository;

@Service
public class RoadService {
    @Autowired
    private RoadRepository userRepository;
    @Autowired
    private MappingUtils mappingUtils;
}