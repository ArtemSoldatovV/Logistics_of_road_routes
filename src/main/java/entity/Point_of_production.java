package entity;

import jakarta.persistence.*;

//точка производства
@Entity
@Table(name = "Point_of_production")
public class Point_of_production extends Point {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "production")
    private int production;

//    public Point_of_production(String name, int production){
// //       super(name);
//        this.production=production;
//    }

    public int getProduction() {
        return production;
    }

    public void setProduction(int production) {
        this.production = production;
    }
}