package service;

import repository.PointRepository;
import org.example.logistics_of_road_routes.MappingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PointService {
    @Autowired
    private PointRepository pointRepository;
    @Autowired
    private MappingUtils mappingUtils;
}