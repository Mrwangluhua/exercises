package test03;
/*
* 定义Person类。

1. 属性：姓名、年龄
2. 构造方法：无参构造方法，有参构造方法
3. 成员方法：getXxx方法，setXxx方法
*/
public class Person {
    private String name;
    private int age;

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

    public Person() {

    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }
}
