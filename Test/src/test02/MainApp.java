package test02;
/*
* 2.1． 训练描述：【Scanner，类和对象】
一、	实现从控制台接收一个学员信息，并存储到一个对象中
二、	打印这个对象的所有属性值。
2.2． 操作步骤描述
	设计，并定义一个学员类：Student，要求有以下属性：
		学员编号（String）
		姓名（String）
		性别（String）
		身高（double）
		年龄（int）
使用封装的原则，并提供无参和全参的构造方法。
	定义MainApp类，并包含main()方法。
	程序启动后，应分别提示用户输入学员编号、姓名等信息。
例如控制台显示：
	C:\>请输入学员编号：
	C:\>....
	C:\>请输入学员姓名：
	C:\>....
	.................
	数据接收到程序中，并定义局部变量存储；
	创建Student对象，通过构造方法将所有数据存储到Student对象中；
	打印对象中的每个属性值。
*/

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        while (true) {
            System.out.println("是否增加一个成员信息：增加请输入1，否则请输入0");
            int flag = sc.nextInt();
            if (flag == 0) {
                break;
            } else if(flag ==1){
                System.out.println("请输入学员学号");
                stu.setID(sc.next());
                System.out.println("请输入学员姓名");
                stu.setName(sc.next());
                System.out.println("请输入学员性别");
                stu.setGender(sc.next());
                System.out.println("请输入学员身高");
                stu.setHigh(sc.nextDouble());
                System.out.println("请输入学员年龄");
                stu.setAge(sc.nextInt());
            }else{
                System.out.println("输入错误");
            }
        }
        stu.showStudent();
    }
  }