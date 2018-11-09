package Exam04;


/*2.定义抽象类Door，要求如下：
 		(1)成员变量: 品牌brand（ String 型）
        (2)生成所有成员变量set/get方法,空参/满参构造
        (3)定义抽象方法：void open(); //开门
        (4)定义抽象方法：void close(); //关门
        (5)定义抽象方法：void usingCard(Card card); //刷卡*/
public abstract class Door {
    private String brand;

    public abstract void open();
    public abstract void close();
    public abstract void usingCard(Card card);

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Door() {

    }

    public Door(String brand) {

        this.brand = brand;
    }
}
