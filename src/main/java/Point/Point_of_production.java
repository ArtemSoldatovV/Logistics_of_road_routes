package Point;

import java.util.List;

//точка производства
public class Point_of_production extends Point {
    private int production;

    public Point_of_production(String name, int production){
        super(name);
        this.production=production;
    }

    public int getProduction() {
        return production;
    }

    public void setProduction(int production) {
        this.production = production;
    }
}