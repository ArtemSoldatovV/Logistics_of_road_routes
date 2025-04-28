package Graph;

import Point.Point;
import Point.Point_of_production;
import Point.Point_of_sale;
import Car.Car;
import Road.Road;

import java.util.ArrayList;
import java.util.List;

//генератор случайных графов
public class Graph_generation {
    private int random_int(int spread){
        return (int) ( Math.random() * (spread+1) );
    }
    private int random_int(){
        return (int) ( Math.random() * 21 );
    }

    private int numbers_without_repetitions(int number ,int spread){
        int exit = random_int(spread);
        while (exit==number){
            exit = random_int(spread);
        }
        return exit;
    }

    //генерация машин
    public List<Car> car_generation(int number_of_car){
        List<Car> list_car = new ArrayList<>();
        for (int i =0;i<number_of_car;i++){
            Car a =new Car("name "+i,2);
            list_car.add(a);
        }
        return list_car;
    }
    //генерация точек
    public List<Point> generating_points(int points){
        Point_of_sale point_of_sale =new Point_of_sale("name "+1, random_int());
        List<Point> list_points = new ArrayList<>();
        list_points.add(point_of_sale);
        for (int i =1 ; i<points-1 ; i++){
            Point a =new Point("name "+i);
            list_points.add(a);
        }
        Point_of_production point_of_production =new Point_of_production("name "+points, random_int());
        list_points.add(point_of_production);
        return list_points;
    }
    //генерация ребер
    public List<Road> generating_edges(int edge, List<Point> list_points){
        List<Road> list_roads = new ArrayList<>();
        for (int i =0 ; i<edge ; i++){
            int number_1 = 0;
            int number_2 = 0;
            if (i!=0 && i!=edge){
                number_1 = random_int(list_points.size());
            } else if (i==0) {
                number_1 =0;
            } else {
                number_1 =list_points.size();
            }
            number_2 =numbers_without_repetitions(number_1,list_points.size());
            Road a =new Road("name "+i, random_int() , number_1 , number_2 );
            list_roads.add(a);
        }
        return list_roads;
    }

}