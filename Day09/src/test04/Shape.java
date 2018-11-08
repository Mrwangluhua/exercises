package test04;

/*定义形状抽象类Shape
1. 成员属性有长,宽,半径
2. 成员方法有计算周长(perimeter)和面积(area)的抽象方法
3. 有参构造(长,宽),有参构造(半径)
*/
public abstract class Shape {
    private double length;
    private double width;
    private double radius;

    public Shape() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Shape(double radius) {

        this.radius = radius;
    }

    public Shape(double length, double width) {

        this.length = length;
        this.width = width;
    }

    public abstract double perimeter();
    public abstract double area();
}
