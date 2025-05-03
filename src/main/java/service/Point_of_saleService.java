package service;

import repository.Point_of_saleRepository;
import org.example.logistics_of_road_routes.MappingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Point_of_saleService {
    @Autowired
    private Point_of_saleRepository userRepository;
    @Autowired
    private MappingUtils mappingUtils;
}