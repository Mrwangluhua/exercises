package Test02;

import java.util.ArrayList;

/* 定义课程类：
  - 属性：课程名称，讲师，学生集合。
  - 提供基本的构造方法和get方法，set方法
  - 成员方法：show方法，打印课程信息，老师姓名，学生是否上课情况。*/
public class Kecheng {
    private String name;
    private Teacher teacher;
    private ArrayList<Student> list;

    public void show(){
        System.out.println("课程名称："+getName());
        System.out.println("授课老师："+teacher.getName());
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if(student.getChuqin().equals("未到")){
                System.out.println("旷课："+student.getName());
            }else{
                System.out.println("上课："+student.getName());
            }
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }

    public Kecheng() {

    }

    public Kecheng(String name, Teacher teacher, ArrayList<Student> list) {

        this.name = name;
        this.teacher = teacher;
        this.list = list;
    }
}
