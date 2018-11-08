package test04;

public class Circle extends Shape{
    public Circle(double radius) {
        super(radius);
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*getRadius();
    }

    @Override
    public double area() {
        return Math.PI*getRadius()*getRadius();
    }
}
