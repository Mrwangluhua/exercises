package Exam07;
/*根据面向对象的要求完成如下功能：
1. 定义描述汽车功能的接口（CarAction）
         抽象方法：  void  carrypassenger()
         默认方法：  void  refueling() 输出“汽车是需要加油的！”
2. 定义交通工具抽象类（Vehicle）
        包含空参、满参构造和以下成员变量
        String name（名称）
        生成所有成员变量setter/getter方法
        抽象方法：    void  transportRoute(Station station)
3. 定义车站类（Station）
       包含空参、满参构造和以下成员变量
        String time(时间)
        String destination(目的地)
        生成所有成员变量setter/getter方法
4. 定义一个公交车类（Bus）继承Vehicle实现CarAction
        包含空参、满参构造
        重写抽象方法：
               Void refueling() 输出“已经加满油了！”
               Void carrypassenger() 输出“载客已满!”
               void transportRoute(Station station)  输出“XXX车已经在YYY点到达了ZZZ站”
Ps:XXX为变量name的属性值，YYY为变量time的属性值，ZZZ为变量destination的属性值
5. Test07测试类 测试以上内容的正确性。编写main方法：
创建并初始化1个Bus对象bus和一个Station对象station， 调用bus对象的refueling（），
 carrypassenger() ，transportRoute(Station station) 方法。
*/
public class Test07 {
}
