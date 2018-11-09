package Exam02;
/*第二题：
根据要求完成以下功能：
① 定义接口CarPlay，要求如下：
定义抽象方法： void cpFunction()
        定义默认方法： void cpConnecting()，要求：输出"可以连接CarPlay"
② 定义抽象类Pad，要求如下：
 		包含空参、满参构造和以下成员变量
名称name（ String 型）
        生成所有成员变量set/get方法
        定义抽象方法：void playMovie(Movie movie)
③定义类Movie
       包含空参、满参构造和以下成员变量
演员名称 playerName（String 型）
电影名称 movieName（ String 型）
        生成所有成员变量set/get方法
④ 定义类IPad，要求如下：
继承抽象类 Pad，实现接口 CarPlay
 	构造方法包括：空参构造和满参构造方法(String)
    重写抽象方法：
            void cpFunction()，要求：输出”支持CarPlay功能”
            void playMovie(Movie movie)，要求：输出打印"XXX IPad正在播放YYY主演的ZZZ电影"
PS：XXX是IPad类中的 name属性值，YYY是Movie 类中的 playerName属性值，ZZZ是Movie 类中的 movieName属性值
⑤ 定义测试类Test02，在main方法实现以下功能：
创建并初始化一个IPad 对象ipad和一个Movie 对象m，调用ipad的 cpFunction()、cpConneting()和playMovie(Movie movie)方法
示例如下：
*/
public class Test02 {
    public static void main(String[] args) {
        IPad ipad = new IPad("玫瑰基佬紫");
        Movie m = new Movie("吴京","战狼二");
        ipad.cpFunction();
        ipad.cpConnecting();
        ipad.playMovie(m);
    }
}
