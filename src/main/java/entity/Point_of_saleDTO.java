package entity;

public class Point_of_saleDTO {
    private int id;
    private String name;
    private int consumption;

//    public Point_of_sale(String name, int consumption){
// //       super(name);
//        this.consumption=consumption;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }
}
