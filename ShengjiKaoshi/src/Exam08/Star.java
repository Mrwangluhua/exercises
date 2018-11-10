package Exam08;
/*2. 定义演员类（Star) 继承 Category，包含空参、满参构造
        实现抽象方法：
        Void work()  输出格式: 编号为XXX的YYY类演员ZZZ在演电视剧
Ps:XXX为变量id的属性值，YYY为category的属性值，ZZZ为变量name的属性值*/
public class Star extends Category {
    public Star() {
    }
    public Star(int id, String name, String category) {
        super(id, name, category);
    }

    @Override
    public void work() {
        System.out.println("编号为"+getId()+"的"+getCategory()+"演员"+getName()+"在演电视剧");
    }
}
