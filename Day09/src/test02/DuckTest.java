package test02;

public class DuckTest extends Duck{
    public static void main(String[] args) {
        Duck duck = new Duck("鸭子","发烧",2,"感冒");
        duck.showMsg();
        duck.showSymptom();
    }
}
