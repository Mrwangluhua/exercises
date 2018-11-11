package Test02;
/*- 定义学生类：
  - 属性：姓名，出勤。
  - 提供基本的构造方法和get方法，set方法。*/
public class Student {
    private String name;
    private String chuqin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChuqin() {
        return chuqin;
    }

    public void setChuqin(String chuqin) {
        this.chuqin = chuqin;
    }

    public Student() {
    }

    public Student(String name, String chuqin) {

        this.name = name;
        this.chuqin = chuqin;
    }
}
