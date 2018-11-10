package Exam05;
/*根据要求完成以下功能：
1.定义Content类，要求如下：
(1)成员变量
标题 	title（String 型）
内容 	content（String 型）
(2)成员方法
void show()
要求：输出"需要打印的内容, 标题: xxx, 内容: yyy"
注意： xxx为变量title的值，yyy为变量content值
(3)生成所有成员变量的set/get方法,空参/满参构造

2.定义Printable接口，要求如下：
		(1)定义抽象方法： void printColor(Content content)

(2)定义默认方法:   void printBlack(Content content)
a.首先,输出以下内容:
"开始打印黑白的内容..."
b.其次:使用输出语句输出content中的内容,模拟打印效果
格式:正在打印黑白的内容,标题是: xxx,内容是: yyy
注意： xxx为content中的变量title的值，yyy为content中的变量content值
c.最后,输出以下内容:
"打印黑白的内容完成..."

(3)定义静态方法:
a.void startColor(),要求：输出"开始打印彩色的内容..."
b.void endColor(),要求：输出"打印彩色的内容完成..."
c.void welcome(),要求：输出"欢迎使用打印功能..."
d.void feedback(),要求：输出"感谢您的使用,有任何建议,请发送邮件到:print@163.com"

3.定义Printer类，要求如下：
(1)实现Printable接口
(2)重写Printable接口中的抽象方法printColor(Content content)
a.首先:调用Printable接口的静态方法startColor()
b.其次:使用输出语句输出content中的内容,模拟打印效果
格式:正在打印彩色的内容,标题是: xxx,内容是: yyy
注意： xxx为content中的变量title的值，yyy为content中的变量content值
c.最后:调用Printable接口的静态方法endColor()
4.定义Worker类，要求如下：
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
(3)生成所有成员变量的set/get方法,空参/满参构造

5.定义测试类Test05，在main方法实现以下功能：
(1)调用Printable接口的静态方法welcome()
	(2)创建Printer类的对象printer
(3)创建Content类的对象content(标题:面向对象的三大特征: ,内容:封装,继承,多态)
	(4)创建Worker类的对象worker(姓名:李四,工号:w001)
	(5)按照以下步骤调用方法:
   		 a.按照黑白的方法打印内容,步骤如下:
        	worker对象调用work方法传递参数printer,content,1
    	 b.输出一条分割线"===================="
    	 c.按照彩色的方法打印内容,步骤如下:
        	worker对象调用work方法传递参数printer,content,2
	(6)调用Printable接口的静态方法feedback()
*/
public class Test05 {
    public static void main(String[] args) {
        Printable.welcome();
        Printer printer = new Printer();
        Content content = new Content("面向对象的三大特征:","封装，继承，多态");
        Worker worker = new Worker("李四","w001");
        worker.work(printer,content,1);
        System.out.println("=========================");
        worker.work(printer,content,2);
        Printable.feedback();
    }
}
