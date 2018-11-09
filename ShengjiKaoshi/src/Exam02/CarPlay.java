package Exam02;
/*① 定义接口CarPlay，要求如下：
定义抽象方法： void cpFunction()
        定义默认方法： void cpConnecting()，要求：输出"可以连接CarPlay"*/
public interface CarPlay {
    public abstract  void cpFunction();

    public default void cpConnecting(){
        System.out.println("可以连接CarPlay");
    }
}
