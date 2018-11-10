package Exam05;
/*4.定义Worker类，要求如下：
(1)成员变量
姓名 	name（String 型）
工号 	no（String 型）
(2)成员方法
work(Printable printer,Content content,int type)
参数说明:
Printable printer:Printable接口的实现类对象
int type:一个int数字,传递1表示进行黑白打印,传递2进行彩色打印
方法功能要求：
        a.使用输出语句输出Woker中的内容,模拟打印效果
            格式:工号: xxx, 姓名: yyy 正在为您打印内容....
            注意： xxx为成员变量no的值，yyy为成员变量name的值
        b.调用参数content的show方法,展示要打印的新
            格式:需要打印的内容, 标题: xxx , 内容: yyy
            注意： xxx为content中的变量title的值，yyy为content中的变量content值
        c.调用参数printer的功能完成打印
            如果参数为1,调用printer的printBlack(Content content)方法
            否则,调用printer的printColor(Content content)方法
(3)生成所有成员变量的set/get方法,空参/满参构造*/
public class Worker {
    private String name;
    private String no;

    public void work(Printable printer,Content content,int type){
        System.out.println("工号："+getNo()+",姓名："+getName()+"正在为您打印内容....");
        content.show();
        if(type==1){
            printer.printBlack(content);
        }else{
            printer.printColor(content);
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Worker() {

    }

    public Worker(String name, String no) {

        this.name = name;
        this.no = no;
    }
}
