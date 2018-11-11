package Test02;

import java.util.ArrayList;
import java.util.Scanner;

/* - 模拟上课出勤情况。
- 定义学生类：
  - 属性：姓名，出勤。
  - 提供基本的构造方法和get方法，set方法。
- 定义讲师类：
  - 属性：姓名。
  - 提供基本的构造方法和get方法，set方法
  - 成员方法：点名方法，设置每一位的学生出勤情况。假定，小明今日未出勤,设置为false。
- 定义课程类：
  - 属性：课程名称，讲师，学生集合。
  - 提供基本的构造方法和get方法，set方法
  - 成员方法：show方法，打印课程信息，老师姓名，学生是否上课情况。
- 定义测试类 :
  - 创建保存学生对象集合stuList
  - 创建若干学生对象,添加到stuList
  - 创建老师对象teacher,调用点名方法.
  - 有参构造方法,创建课程对象,打印班级出勤信息.
*/
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student1 = new Student("张三","未知");
        Student student2 = new Student("李四","未知");
        Student student3 = new Student("王五","未知");
        Student student4 = new Student("小明","未知");
        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        Teacher teacher = new Teacher("张老师");
        Kecheng java = new Kecheng("Java",teacher,list);
        System.out.println("开始上课,准备点名");
        int count = 0;
        while(true) {
            System.out.println("请输入姓名：");
            String name = sc.next();
            System.out.println("是否出勤？");
            String cq = sc.next();
            teacher.dianMing(list,name,cq);
            count++;
            if(count==list.size()){
                break;
            }
        }
        java.show();
    }
}
