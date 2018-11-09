package Exam04;
/*根据要求完成以下功能：
1.定义接口Lock，要求如下：
        (1)定义抽象方法： void lockUp();	  //上锁
        (2)定义抽象方法： void openLock();  //开锁
        (3)定义默认方法： void scanningCard()，要求：输出"可以扫卡开门"
2.定义抽象类Door，要求如下：
 		(1)成员变量: 品牌brand（ String 型）
        (2)生成所有成员变量set/get方法,空参/满参构造
        (3)定义抽象方法：void open(); //开门
        (4)定义抽象方法：void close(); //关门
        (5)定义抽象方法：void usingCard(Card card); //刷卡
3.定义类Card
        (1)成员变量:
            用户名称 userName（String 型）
            用户密码 passWord（ String 型）
        (2)生成所有成员变量set/get方法,包含空参/满参构造
4.定义类TheftproofDoor，要求如下：
(1)继承抽象类 Door，实现接口 Lock
 		(2)构造方法包括：空参构造和满参构造方法(String)
    	(3)重写抽象方法：
        	void lockUp()
                    要求：输出”插进钥匙,向左旋转钥匙三圈,锁上了,拔出钥匙...”
        	void openLock()
                    要求：输出"插进钥匙,向右旋转钥匙三圈，锁打开了,拔出钥匙..."
            void usingCard(Card card)
                    要求：输出"用户 XXX 正在使用密码是 yyy 的卡打开 zzz品牌的防盗门"
PS：xxx是Card类中的 userName属性值，yyy 是Card类中的 passWord属性值，zzz是Door类中的 brand属性值
void open()
要求：输出"用力推门,门打开了..."
void close()
要求:  输出"轻轻拉门,门关上了..."
5.定义测试类Test04，在main方法实现以下功能：
	(1)创建一个TheftproofDoor 对象door和一个Card 对象card
	(2)请按以下顺序依次调用door的 close()、lockUp()、scanningCard()、usingCard（Card card）、openLock()、open()方法

*/
public class Test04 {
    public static void main(String[] args) {
        TheftproofDoor door = new TheftproofDoor();
        door.setBrand("步阳");
        Card card = new Card("李鹏","23456789");
        door.close();
        door.lockUp();
        door.scanningCard();
        door.usingCard(card);
        door.openLock();
        door.open();
    }
}
