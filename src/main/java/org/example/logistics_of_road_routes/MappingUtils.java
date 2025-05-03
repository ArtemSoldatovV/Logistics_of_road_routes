package org.example.logistics_of_road_routes;

import entity.*;

public class MappingUtils {
    public PointDTO mapToPointDTO(Point point){
        PointDTO pointDTO = new PointDTO();
        pointDTO.setId(point.getId());
        pointDTO.setName(point.getName());
        return pointDTO;
    }
    public Point mapToPoint(PointDTO pointDTO){
        Point point = new Point();
        point.setId(pointDTO.getId());
        point.setName(pointDTO.getName());
        return point;
    }

    public Point_of_productionDTO mapToPoint_of_productionDTO(Point_of_production point){
        Point_of_productionDTO pointDTO = new Point_of_productionDTO();
        pointDTO.setId(point.getId());
        pointDTO.setName(point.getName());
        return pointDTO;
    }
    public Point_of_production mapToPoint_of_production(Point_of_productionDTO pointDTO){
        Point_of_production point = new Point_of_production();
        point.setId(pointDTO.getId());
        point.setName(pointDTO.getName());
        return point;
    }

    public Point_of_saleDTO mapToPoint_of_saleDTO(Point_of_sale point){
        Point_of_saleDTO pointDTO = new Point_of_saleDTO();
        pointDTO.setId(point.getId());
        pointDTO.setName(point.getName());
        return pointDTO;
    }
    public Point_of_sale mapToPoint_of_sale(Point_of_saleDTO pointDTO){
        Point_of_sale point = new Point_of_sale();
        point.setId(pointDTO.getId());
        point.setName(pointDTO.getName());
        return point;
    }

    public CarDTO mapToCarDTO(Car car){
        CarDTO carDTO = new CarDTO();
        carDTO.setId(car.getId());
        carDTO.setName(car.getName());
        carDTO.setTonnage(car.getTonnage());
        return carDTO;
    }
    public Car mapToCar(CarDTO carDTO){
        Car car = new Car();
        car.setId(carDTO.getId());
        car.setName(carDTO.getName());
        car.setTonnage(carDTO.getTonnage());
        return car;
    }

    public RoadDTO mapToRoadDTO(Road road){
        RoadDTO roadDTO = new RoadDTO();
        roadDTO.setId(road.getId());
        roadDTO.setName(road.getName());
        roadDTO.setScore_throughput_capacity(road.getScore_throughput_capacity());
        roadDTO.setPointt_1(road.getPointt_1());
        roadDTO.setPointt_2(road.getPointt_2());
        return roadDTO;
    }
    public Road mapToRoad(RoadDTO roadDTO){
        Road road = new Road();
        road.setId(roadDTO.getId());
        road.setName(roadDTO.getName());
        road.setScore_throughput_capacity(roadDTO.getScore_throughput_capacity());
        road.setPointt_1(roadDTO.getPointt_1());
        road.setPointt_2(roadDTO.getPointt_2());
        return road;
    }

}
