package Exam04;

/*4.定义类TheftproofDoor，要求如下：
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
*/
public class TheftproofDoor extends Door implements Lock {

    @Override
    public void open() {
        System.out.println("用力推门,门打开了...");
    }

    @Override
    public void close() {
        System.out.println("轻轻拉门,门关上了...");
    }

    /*    /* void usingCard(Card card)
                    要求：输出"用户 XXX 正在使用密码是 yyy 的卡打开 zzz品牌的防盗门"
PS：xxx是Card类中的 userName属性值，yyy 是Card类中的 passWord属性值，zzz是Door类中的 brand属性值
*/
    @Override
    public void usingCard(Card card) {
        System.out.println("用户 "+card.getUserName()+" 正在使用密码是 "+card.getPassWord()+" 的卡打开 "+getBrand()+"品牌的防盗门");
    }

    @Override
    public void lockUp() {
        System.out.println("插进钥匙,向左旋转钥匙三圈,锁上了,拔出钥匙...");
    }

    @Override
    public void openLock() {
        System.out.println("插进钥匙,向右旋转钥匙三圈，锁打开了,拔出钥匙...");
    }

}
