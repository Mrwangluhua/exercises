package test03;
/*
* 定义Student类，继承Person
1. 属性：分数
2. 构造方法：无参构造方法，有参构造方法
3. 成员方法：getXxx方法，setXxx方法，考试方法
*/
public class Student extends Person {
    private int fenshu;

    public Student(int fenshu) {
        this.fenshu = fenshu;
    }

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, int fenshu) {
        super(name, age);

        this.fenshu = fenshu;
    }

    public int getFenshu() {
        return fenshu;
    }

    public void setFenshu(int fenshu) {
        this.fenshu = fenshu;
    }
    public void kaoshi(){
        System.out.println(getName()+"同学，考试得了"+fenshu+"分");
    }
}
