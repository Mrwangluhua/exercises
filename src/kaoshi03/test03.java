package kaoshi03;

public class test03 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("张三","Java");
        Student student1 = new Student("李四",65,teacher);
        Student student2 = new Student("王五", 59, teacher);

        teacher.teaching();
        student1.getMyResult();
        student2.getMyResult();
        student1.TorF(student1.getScore());
        student2.TorF(student2.getScore());
    }
}
