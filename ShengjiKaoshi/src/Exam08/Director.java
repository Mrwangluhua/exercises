package Exam08;
/*4. 导演类Director类，包含空参、满参构造和以下成员变量
        年龄age(int类型)，
        姓名name（String类型）
        生成所有成员变量set/get方法
        成员方法：
                组织表演：void letPlay(Actor a) 要求：输出“导演：KKK正在导戏”，
                然后在方法内依次调用level（），study（），play(Star star)。*/
public class Director {
    private int age;
    private String name;

    public void letPlay(Actor a,Star star){
        System.out.println("导演："+getName()+"正在导戏");
        a.level();
        Actor.study();
        a.play(star);
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Director() {
    }

    public Director(int age, String name) {

        this.age = age;
        this.name = name;
    }
}
