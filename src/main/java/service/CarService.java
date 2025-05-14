package service;

import entity.Car;
import entity.CarDTO;
import repository.CarRepository;
import org.example.logistics_of_road_routes.MappingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private MappingUtils mappingUtils;

    public Optional<CarDTO> findById(Long id) {
        return carRepository.findById(id)
                .map(mappingUtils::mapToCarDTO);
    }

    public Car save(Car car) {
        // Добавьте проверку валидности здесь
        return carRepository.save(car);
    }

    public List<CarDTO> findAll() {
        return carRepository.findAll().stream()
                .map(mappingUtils::mapToCarDTO)
                .collect(Collectors.toList());
    }

    public Car update(Long id, Car carDetails) {
        Optional<Car> optionalProduct = carRepository.findById(id);

        Car car = optionalProduct.get();
        car.setName(carDetails.getName());
        car.setTonnage(carDetails.getTonnage());
        return carRepository.save(car);

    }

    public void delete(Long id) {
        carRepository.deleteById(id);
    }
}
