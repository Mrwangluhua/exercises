package test02;
/*
* 2.2． 操作步骤描述
	设计，并定义一个学员类：Student，要求有以下属性：
		学员编号（String）
		姓名（String）
		性别（String）
		身高（double）
		年龄（int）*/
public class Student {
    private String ID;
    private String name;
    private String gender;
    private double high;
    private int age;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String ID, String name, String gender, double high, int age) {

        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.high = high;
        this.age = age;
    }

    public Student() {

    }
    public void showStudent(){
        System.out.println("学员编号\t姓名\t性别\t身高\t年龄");
        System.out.println(ID+"\t\t\t"+name+"\t"+gender+"\t\t"+high+"\t"+age);
    }
}
