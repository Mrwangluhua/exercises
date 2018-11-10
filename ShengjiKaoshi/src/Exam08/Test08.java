package Exam08;
/*根据面向对象的要求，完成如下功能：
1. 定义抽象明星的类别类(Category)，包含空参、满参构造和以下成员变量
        编号id （int类型）
        姓名name (String类型)
        类别category（String类型）
        生成所有成员变量set/get方法
        抽象方法：  void work()
2. 定义演员类（Star) 继承 Category，包含空参、满参构造
        实现抽象方法：
        Void work()  输出格式: 编号为XXX的YYY类演员ZZZ在演电视剧
Ps:XXX为变量id的属性值，YYY为category的属性值，ZZZ为变量name的属性值
3. 定义表演接口(Actor)
        抽象方法:void play( Star star)
        默认方法:void level() 要求输出：“机会总是留给有准备的人”
        静态方法：void study() 要求输出：“敏而好学，不耻下问”
4. 导演类Director类，包含空参、满参构造和以下成员变量
        年龄age(int类型)，
        姓名name（String类型）
        生成所有成员变量set/get方法
        成员方法：
                组织表演：void letPlay(Actor a) 要求：输出“导演：KKK正在导戏”，
                然后在方法内依次调用level（），study（），play(Star star)。
PS：  KKK为类Director变量name值，参数star需要自行创建并初始化变量id,name与 category
5. 测试类Test08，提供main方法
        创建导演类(Director)对象 ，调用letPlay(Actor a)方法。
         a为Actor 的实现类，需要实现play(Star star)抽象方法，
          实现要求：调用参数star的work()方法;
*/
public class Test08 {
    public static void main(String[] args) {
        Director director = new Director(78,"张艺谋");
        Star sr = new Star(2,"王菲","唱歌类");
        A a = new A();
        director.letPlay(a,sr);

    }
}
