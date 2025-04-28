package Car;

public class Car {
    private static int idCounter = 0;
    private int id;
    private String name;
    private int tonnage;

    public Car(String name, int tonnage){
        this.id=++idCounter;
        this.name=name;
        this.tonnage=tonnage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public int getId() {
        return id;
    }
}
