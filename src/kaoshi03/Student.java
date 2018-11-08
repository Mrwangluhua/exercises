package kaoshi03;

public class Student {
    private String name;
    private int score;
    private Teacher teacher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student(String name, int score, Teacher teacher) {

        this.name = name;
        this.score = score;
        this.teacher = teacher;
    }

    public Student() {

    }
    public void getMyResult(){
        System.out.println("我是学生"+name+",\t我的老师是"+teacher.getName()+"他教我"+teacher.getCourse()+"学科");
    }
    //判断是否及格
    public void TorF(int score){
        if(score>60){
            System.out.println("继续加油哦");
        }else{
            System.out.println("成绩太低了，"+teacher.getName()+"老师让我回去罚写100遍，");
        }
    }
}
