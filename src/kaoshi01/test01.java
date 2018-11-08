package kaoshi01;

import java.util.ArrayList;

public class test01 {
    public static void main(String[] args) {
        Student student1 = new Student("张三",18,90);
        Student student2 = new Student("李四",28,80);
        Student student3 = new Student("王五",38,50);

        ArrayList<Student> list = new ArrayList<>();
        ArrayList<Student> list1 = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list1 = filterStudent(list,60);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i).getName()+","+list1.get(i).getAge()+","+list1.get(i).getScore());
        }
    }
    public static ArrayList<Student> filterStudent(ArrayList<Student>list ,int score){
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);//如果要从list 取出值，必须要用list集合的下标进行操作
            if(score<student.getScore()){
                students.add(student);
            }
        }
        return students;
    }
}
