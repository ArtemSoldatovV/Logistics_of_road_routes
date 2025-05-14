package entity;

public class Point_of_productionDTO {
    private Long id;
    private String name;
    private int production;

//    public Point_of_production(String name, int production){
// //       super(name);
//        this.production=production;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProduction() {
        return production;
    }

    public void setProduction(int production) {
        this.production = production;
    }
}
