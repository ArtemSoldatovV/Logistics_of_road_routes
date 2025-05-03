package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Point")
public class Point extends Abstract_point {
//    private static int idCounter = 0;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;

//    public Point(String name){
// //       this.id=++idCounter;
//        this.name=name;
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

}
