package test02;
/*
* 1. 模拟农学院动物医疗系统信息。
   1. 定义抽象家禽类(Poultry)
   2. 私有成员变量：动物种类(name)，症状(symptom)，年龄(age)， 病因（illness）
   3. 提供空参和带参构造方法
   4. 成员方法：
      1. 抽象方法 : 显示症状(showSymptom)
      2. 普通方法 : 显示基本信息(showMsg)
      3. 提供setXxx和getXxx方法
2. 定义普通鸭子类(Duck)继承家禽类
   1. 提供空参和带参构造方法
   2. 重写showSymptom方法，打印症状信息。
      在测试类中创建Duck对象并调用showSymptom,showMsg方法
*/
public abstract class Poultry {
    private String name;
    private String symptom;
    private int age;
    private String illness;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public Poultry(String name, String symptom, int age, String illness) {

        this.name = name;
        this.symptom = symptom;
        this.age = age;
        this.illness = illness;
    }

    public Poultry() {

    }
    //1. 抽象方法 : 显示症状(showSymptom)
    public abstract void showSymptom();
    // 2. 普通方法 : 显示基本信息(showMsg)
    public void showMsg(){
        //动物种类(name)，症状(symptom)，年龄(age)， 病因（illness）
        System.out.println("动物种类："+name+",年龄："+age+"岁\n"+"入院原因："+illness);

    }
}
