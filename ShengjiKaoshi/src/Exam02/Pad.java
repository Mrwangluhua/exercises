package Exam02;
/*② 定义抽象类Pad，要求如下：
 		包含空参、满参构造和以下成员变量
名称name（ String 型）
        生成所有成员变量set/get方法
        定义抽象方法：void playMovie(Movie movie)*/
public abstract class Pad {
    private String name;

    public abstract void playMovie(Movie movie);
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pad() {

    }

    public Pad(String name) {

        this.name = name;
    }
}
