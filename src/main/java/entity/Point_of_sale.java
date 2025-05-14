package entity;

import jakarta.persistence.*;

//точка сбыта
@Entity
@Table(name = "Point_of_sale")
public class Point_of_sale extends Point {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "consumption")
    private int consumption;

//    public Point_of_sale(String name, int consumption){
// //       super(name);
//        this.consumption=consumption;
//    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }
}