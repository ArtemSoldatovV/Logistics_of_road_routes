package Road;

public class Road {
    private static int idCounter = 0;
    private int id;
    private String name;
    private int score_throughput_capacity; //пропускная способность
    private int pointt_1;
    private int pointt_2;

    public Road(String name, int score_throughput_capacity, int pointt_1, int pointt_2){
        this.id=++idCounter;
        this.name=name;
        this.score_throughput_capacity=score_throughput_capacity;
        this.pointt_1=pointt_1;
        this.pointt_2=pointt_2;
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

    public int getScore_throughput_capacity() {
        return score_throughput_capacity;
    }

    public void setScore_throughput_capacity(int score_throughput_capacity) {
        this.score_throughput_capacity = score_throughput_capacity;
    }

    public int getPointt_1() {
        return pointt_1;
    }

    public void setPointt_1(int pointt_1) {
        this.pointt_1 = pointt_1;
    }

    public int getPointt_2() {
        return pointt_2;
    }

    public void setPointt_2(int pointt_2) {
        this.pointt_2 = pointt_2;
    }

    public int get_auto_road_withdrawal(int road){
        if (getPointt_1()==road){
            return getPointt_1();
        } else if (getPointt_2()==road) {
            return getPointt_2();
        }else {
            System.out.print("Errorr");
            return 0;
        }
    }
}
