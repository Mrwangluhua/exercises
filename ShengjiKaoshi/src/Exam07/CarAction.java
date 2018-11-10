package Exam07;
/*1. 定义描述汽车功能的接口（CarAction）
         抽象方法：  void  carrypassenger()
         默认方法：  void  refueling() 输出“汽车是需要加油的！”*/
public interface CarAction {
    public abstract void carrypassenger();
    public default void refueling(){
        System.out.println("汽车是需要加油的！");
    }
}
