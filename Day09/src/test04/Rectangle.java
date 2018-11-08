package test04;
/*
* 1. 定义矩形Rectangle和圆形Circle继承Shape类。
   1. 重写计算周长和面积的方法
2. 圆形只能通过指定半径的方式，创建Circle对象。
3. 矩形只能通过指定长，宽的方法，创建Rectangle对象。
4. 定义测试类测试长方形和圆形计算周长和面积的方法
*/
public class Rectangle extends Shape {
    public Rectangle(){

    }
    @Override
    public double perimeter() {
        return 2*(getLength()+getWidth());
    }

    @Override
    public double area() {
        return getLength()*getWidth();
    }

    public Rectangle(double length, double width) {
        super(length, width);
    }
}
