package Class;

public class Student {
    private int age;
    private String name;

    public  void show(){
        System.out.println(name+"   "+age);
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

    public Student(int age, String name) {

        this.age = age;
        this.name = name;
    }

    public Student() {

    }

}
