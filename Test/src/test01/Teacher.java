package test01;

public class Teacher {
    private String name;
    private int age;
    private String gender;
    private String subject;
    private String ID;

    public Teacher(String name, int age, String gender, String subject, String ID) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.subject = subject;
        this.ID = ID;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher() {

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    public void showTeacher(){
        System.out.println(ID+"\t\t"+name+"\t"+gender+"\t\t"+age+"\t\t"+subject);
    }
}
