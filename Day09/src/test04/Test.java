package test04;

public class Test {
    public static void main(String[] args) {
        //没有设置无参构造 不可以用无参构造
        Rectangle rec = new Rectangle(50.0,100.0);
        System.out.println("长方形周长是"+rec.perimeter());
        System.out.println("长方形面积是"+rec.area());

        Circle cir = new Circle(10);
        System.out.println("圆的周长是"+cir.perimeter());
        System.out.println("圆的面积是"+cir.area());
    }
}
