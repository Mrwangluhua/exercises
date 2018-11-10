package Exam06;
/*1 定义"学生"类,Student,包含以下成员:
   成员属性:
           name (姓名):String类型
          chinese(语文):int类型
          math(数学):int类型
          属性使用private修饰。
  成员方法:
          （1）get/set方法，构造方法
          （2）void show()方法,打印对象所有属性的值以及对象的语文和数学成绩的总和到控制台;*/
public class Student {
    private String name;
    private int chinese;
    private int math;

    public void show(){
        System.out.println("姓名是："+getName());
        System.out.println("语文成绩是："+getChinese());
        System.out.println("数学成绩是："+getMath());
        System.out.println("总成绩是："+(getChinese()+getMath()));
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public Student() {

    }

    public Student(String name, int chinese, int math) {

        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }
}
