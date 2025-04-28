package Point;

import java.util.List;

public class Point extends Abstract_point {
    private static int idCounter = 0;
    private int id;
    private String name;


    public Point(String name){
        this.id=++idCounter;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
