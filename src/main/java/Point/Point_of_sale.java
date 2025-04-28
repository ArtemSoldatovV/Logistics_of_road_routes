package Point;

import java.util.List;
//точка сбыта
public class Point_of_sale extends Point {
    private int consumption;

    public Point_of_sale(String name, int consumption){
        super(name);
        this.consumption=consumption;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }
}