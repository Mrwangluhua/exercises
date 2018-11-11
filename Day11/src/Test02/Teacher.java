package Test02;

import java.util.ArrayList;

/*- 定义讲师类：
  - 属性：姓名。
  - 提供基本的构造方法和get方法，set方法
  - 成员方法：点名方法，设置每一位的学生出勤情况。假定，小明今日未出勤,设置为false。*/
public class Teacher {
    private String name;

    public ArrayList<Student> dianMing(ArrayList<Student> stuList, String name, String str) {
        for (int i = 0; i < stuList.size(); i++) {
            Student stu = stuList.get(i);
            if (name.equals(stu.getName()))
                stu.setChuqin(str);
        }
        return stuList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher() {

    }

    public Teacher(String name) {

        this.name = name;
    }
}
