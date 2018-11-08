package test02;
/*动物种类(name)，症状(symptom)，年龄(age)， 病因（illness）
2. 定义普通鸭子类(Duck)继承家禽类
   1. 提供空参和带参构造方法
   2. 重写showSymptom方法，打印症状信息。
      在测试类中创建Duck对象并调用showSymptom,showMsg方法*/
public class Duck extends Poultry{
    public Duck() {
    }

    public Duck(String name, String symptom, int age, String illness) {

        super(name, symptom, age, illness);
    }

    @Override
    public void showSymptom() {
        System.out.println("症状为："+getSymptom());
    }
}
