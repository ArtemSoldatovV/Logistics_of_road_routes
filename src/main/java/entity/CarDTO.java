package entity;

public class CarDTO {

    private Long id;

    private String name;

    private int tonnage;

//    public CarDTO(String name, int tonnage){
//        this.name=name;
//        this.tonnage=tonnage;
//    }

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}