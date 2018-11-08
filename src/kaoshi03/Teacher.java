package kaoshi03;

public class Teacher extends Teach{
    private String name;
    private String course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Teacher(String name, String course) {

        this.name = name;
        this.course = course;
    }

    public Teacher() {

    }

    @Override
    public void teaching() {
        System.out.println("我是"+name+"老师，我教"+course+"学科");
    }
}
