package Exam07;
/*3. 定义车站类（Station）
       包含空参、满参构造和以下成员变量
        String time(时间)
        String destination(目的地)
        生成所有成员变量setter/getter方法*/
public class Station {
    private String time;
    private String destination;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Station() {

    }

    public Station(String time, String destination) {

        this.time = time;
        this.destination = destination;
    }
}
