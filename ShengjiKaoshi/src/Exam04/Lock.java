package Exam04;
/*1.定义接口Lock，要求如下：
        (1)定义抽象方法： void lockUp();	  //上锁
        (2)定义抽象方法： void openLock();  //开锁
        (3)定义默认方法： void scanningCard()，要求：输出"可以扫卡开门"
*/
public interface Lock {
    public abstract void lockUp();
    public abstract void openLock();
    public default void scanningCard(){
        System.out.println("可以扫卡开门");
    }
}
