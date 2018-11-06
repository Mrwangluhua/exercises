package test01;

/*一、	有以下数据：
1.	三个老师信息：
教师编号	姓名	性别	年龄	科目
t001			薛之谦	男		26		Java
t002			张碧晨	女		24		IOS
t003			张杰	男		28		Java
2.	存储两个科目信息：
课程编号	名称	创建时间	课程描述
s001			Java		2007-02-08	Java学科，包含JavaSE和JavaEE
s002			IOS		2007-02-09	IOS系统开发
二、	请分别定义两个类；
三、	创建MainApp类中，包含main()方法，创建相应对象，通过构造方法给成员变量赋值。
四、	打印每个对象的所有属性。
要求：每个类要按照封装的原则进行定义。并提供无参和全参的构造方法。
*/
public class MainApp {
    public static void main(String[] args) {
        /*1.	三个老师信息：
                教师编号	姓名	性别	年龄	科目
                t001			薛之谦	男		26		Java
                t002			张碧晨	女		24		IOS
                t003			张杰	男		28		Java
                */
        Teacher tec1 = new Teacher("薛之谦",26,"男","Java","t001");
        Teacher tec2 = new Teacher("张碧晨",24,"女","IOS","t002");
        Teacher tec3 = new Teacher("张杰",28,"男","Java","t003");
        System.out.println("教师编号\t姓名\t性别\t年龄\t科目");
        tec1.showTeacher();
        tec2.showTeacher();
        tec3.showTeacher();
        /*2.	存储两个科目信息：
                课程编号	名称	创建时间	课程描述
                s001			Java		2007-02-08	Java学科，包含JavaSE和JavaEE
                s002			IOS		2007-02-09	IOS系统开发*/
        Subject sub1 = new Subject("s001","Java","2007-02-08","Java学科，包含JavaSE和JavaEE");
        Subject sub2 = new Subject("s002","IOS\t","2007-02-09","IOS系统开发");
        System.out.println("课程编号\t名称\t创建时间\t课程描述");
        sub1.showSubject();
        sub2.showSubject();

    }
}
