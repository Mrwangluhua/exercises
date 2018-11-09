package Exam03;
/*
* ③	定义类Worker，包含空参、满参构造和以下成员变量
        姓名 name（String 型）
        年龄 age（int型）
        生成所有成员变量set/get方法
定义成员方法：void working(Workable wa)，要求：输出“xxxx工作中中”，
                然后在方法内依次调用work()，workContent(Content content)
PS：
xxx为变量name值，参数content需要自行创建并初始化变量bugContent与 moduleContent
*/
public class Worker {
    private String name;
    private int age;

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Worker() {

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
/*定义成员方法：void working(Workable wa)，要求：输出“xxxx工作中中”，
                然后在方法内依次调用work()，workContent(Content content)*/
    public void working(Workable wa){
        System.out.println(getName()+"工作中");
        Content content = new Content("调试前端页面上的bug","开发添加模块");
        wa.work();
        wa.workContent(content);
    }
}
