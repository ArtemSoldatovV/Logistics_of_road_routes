package entity;

public class PointDTO {
    //    private static int idCounter = 0;
    private Long id;
    private String name;


//    public PointDTO(String name){
// //       this.id=++idCounter;
//        this.name=name;
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

}