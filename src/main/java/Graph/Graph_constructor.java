package Graph;

import Car.Car;
import Point.Point;
import Road.Road;

import java.util.ArrayList;
import java.util.List;

public class Graph_constructor {
    private List<Car> list_car = new ArrayList<>();
    private List<Point> list_points = new ArrayList<>();
    private List<Road> list_roads = new ArrayList<>();

    public void car_generation(int number_of_car){
        Graph_generation graph_generation = new Graph_generation();
        list_car=graph_generation.car_generation(number_of_car);
    }
    public void generating_points(int points){
        Graph_generation graph_generation = new Graph_generation();
        list_points=graph_generation.generating_points(points);
    }
    public void generating_edges(int edge){
        Graph_generation graph_generation = new Graph_generation();
        list_roads=graph_generation.generating_edges(edge,list_points);
    }
    //  id_verification =========================
    public int id_verification_road(int road_id){
        if (list_roads.remove(1).getId() != road_id){
            if (list_roads.remove(road_id).getId() >= road_id){
                road_id = road_id - (list_roads.remove(road_id).getId() - road_id);
            }
            else {
                road_id = road_id - (road_id - list_roads.remove(road_id).getId());
            }
        }
        return road_id;
    }
    public int id_verification_point(int point_id){
        if (list_points.remove(1).getId() != point_id){
            if (list_points.remove(point_id).getId() >= point_id){
                point_id = point_id - (list_points.remove(point_id).getId() - point_id);
            }
            else {
                point_id = point_id - (point_id - list_points.remove(point_id).getId());
            }
        }
        return point_id;
    }
    public int id_verification_car(int car_id){
        if (list_car.remove(1).getId() != car_id){
            if (list_car.remove(car_id).getId() >= car_id){
                car_id = car_id - (list_car.remove(car_id).getId() - car_id);
            }
            else {
                car_id = car_id - (car_id - list_car.remove(car_id).getId());
            }
        }
        return car_id;
    }
    //  road    =========================
    public void change_the_path_of_the_road(int road_id, int old_end_of_the_road, int new_end_of_the_road){
        //id verification
        road_id = id_verification_road(road_id);
        //code
        if (old_end_of_the_road == list_roads.remove(road_id).getPointt_1()){
            list_roads.remove(road_id).setPointt_1(new_end_of_the_road);
        }
        else if (old_end_of_the_road == list_roads.remove(road_id).getPointt_2()) {
            list_roads.remove(road_id).setPointt_2(new_end_of_the_road);
        }
        else {
            System.out.print("error");
        }
    }
    public void change_the_capacity_of_the_road(int road_id, int new_Score_throughput_capacity){
        road_id = id_verification_road(road_id);
        list_roads.remove(road_id).setScore_throughput_capacity(new_Score_throughput_capacity);
    }
    public void rename_road(int road_id, String new_name){
        road_id = id_verification_road(road_id);
        list_roads.remove(road_id).setName(new_name);
    }
    //  point   =========================
    public void rename_point(int point_id, String new_name){
        point_id = id_verification_point(point_id);
        list_points.remove(point_id).setName(new_name);
    }
    //  car     =========================
    public void rename_car(int car_id, String new_name){
        car_id = id_verification_car(car_id);
        list_car.remove(car_id).setName(new_name);
    }
    public void retonnage_car(int car_id, int new_tonnage){
        car_id = id_verification_car(car_id);
        list_car.remove(car_id).setTonnage(new_tonnage);
    }
}
