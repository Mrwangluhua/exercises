package Exam07;
/*2. 定义交通工具抽象类（Vehicle）
        包含空参、满参构造和以下成员变量
        String name（名称）
        生成所有成员变量setter/getter方法
        抽象方法：    void  transportRoute(Station station)*/
public abstract class Vehicle {
    private String name;

    public abstract void transportRoute(Station station);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle() {

    }

    public Vehicle(String name) {

        this.name = name;
    }
}
