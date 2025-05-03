package Graph;

import entity.Point;
import entity.Road;

import java.util.ArrayList;
import java.util.List;

public class Graph_traversal {

    private List<Road> creating_an_array_of_paths(List<Point> list_point, List<Road> list_road, int current_position_point){
        List<Road> outgoing_roads = list_road.stream()
                .filter(road -> road.getPointt_1() == list_point.get(current_position_point).getId())
                .toList();
        outgoing_roads.addAll(list_road.stream()
                .filter(road -> road.getPointt_2() == list_point.get(current_position_point).getId())
                .toList());
        return outgoing_roads;
    }

    public List<Integer> traversal(List<Point> listPoint, List<Road> listRoad, Point endPoint) {
        int shortestPathWeight = Integer.MAX_VALUE; // Вес кратчайшего пути
        List<Integer> bestPathIds = new ArrayList<>(); // Хранит ID точек кратчайшего пути

        List<Integer> currentPathIds = new ArrayList<>(); // Хранит ID текущего пути
        List<Road> outgoingRoads; // Все доступные пути

        int currentPositionIndex = 0; // Индекс текущей точки в списке точек

        while (currentPositionIndex < listPoint.size()) {
            Point currentPoint = listPoint.get(currentPositionIndex);
            outgoingRoads = creating_an_array_of_paths(listPoint, listRoad, currentPoint.getId() );//currentPositionIndex

            for (Road road : outgoingRoads) { // Обход путей
                Point nextPoint = listPoint.get( road.get_auto_road_withdrawal(currentPoint.getId()) );
                int currentPathWeight = road.getScore_throughput_capacity();

                if (currentPathWeight < shortestPathWeight) { // Проверяем, имеет ли смысл идти по дороге
                    currentPathIds.add(road.getId()); // Добавляем ID дороги в текущий путь

                    if (nextPoint.equals(endPoint)) { // Проверяем, достигли ли мы конечной точки
                        shortestPathWeight = currentPathWeight; // Обновляем вес кратчайшего пути
                        bestPathIds.clear();
                        bestPathIds.addAll(currentPathIds); // Сохраняем лучший путь
                    } else {
                        currentPositionIndex += 1; // Переходим к следующей точке
                    }
                }
            }

            if (!currentPathIds.isEmpty()) {
                currentPathIds.remove(currentPathIds.size() - 1); // Убираем последнюю дорогу из текущего пути при возврате назад
            }
            currentPositionIndex -= 1; // Возвращаемся к предыдущей точке
        }

        return bestPathIds;//мы получаем id дорог до нужной точки
    }
    public List<Point> traversal(List<Point> listPoint, List<Road> currentPositionIndex) {
        List<Point> listPoint_exit = listPoint.stream()
                .filter(n -> currentPositionIndex.get(0).getPointt_1() == n.getId())
                .toList();
        for (Road road : currentPositionIndex) {
            listPoint_exit.addAll(listPoint.stream()
                    .filter(n -> currentPositionIndex.get(0).getPointt_1() == n.getId())
                    .toList());
        }
        return listPoint_exit;
    }

}
