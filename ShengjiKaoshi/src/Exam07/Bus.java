package Exam07;
/*4. 定义一个公交车类（Bus）继承Vehicle实现CarAction
        包含空参、满参构造
        重写抽象方法：
               Void refueling() 输出“已经加满油了！”
               Void carrypassenger() 输出“载客已满!”
               void transportRoute(Station station)  输出“XXX车已经在YYY点到达了ZZZ站”*/
public class Bus extends Vehicle implements CarAction{
    public Bus() {
    }

    public Bus(String name) {
        super(name);
    }

    @Override
    public void refueling() {
        System.out.println("已经加满油了！");
    }

    @Override
    public void carrypassenger() {
        System.out.println("载客已满！");
    }

    @Override
    public void transportRoute(Station station) {
        System.out.println(getName()+"车已经在"+station.getTime()+"到达了"+station.getDestination());
    }
}
