package test03;
/*
* 1. 创建Teacher对象并初始化赋值,然后调用讲课方法
2. 创建Student对象并初始化赋值,然后调用考试方法
*/
public class Test{
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("王小平");
        t1.setAge(35);
        t1.setScience("Java");

        Student stu1 = new Student();
        stu1.setAge(16);
        stu1.setName("李小乐");
        stu1.setFenshu(90);

        t1.jiangke();
        stu1.kaoshi();
    }
}
