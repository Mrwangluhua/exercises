package Exam03;
/*第三题：
根据要求完成以下功能：
①	 定义接口Workable，要求如下：
      定义抽象方法： void workContent(Content content)
      定义默认方法： void work()，要求输出：
                        "今天工作不努力"
                     	"明天努力找工作"
②	定义类Content ，包含空参、满参构造和以下成员变量
            调试bug 		bugContent（String 型）
                开发模块 	moduleContent（String 型）
                生成所有成员变量set/get方法
定义成员方法：void printContent(),要求：输出"工作路线，调试bug：xxx，开发模块：yyy",
PS： xxx为变量bugContent值，yyy为变量moduleContent值
③	定义类Worker，包含空参、满参构造和以下成员变量
        姓名 name（String 型）
年龄 age（int型）
        生成所有成员变量set/get方法
定义成员方法：void working(Workable wa)，要求：输出“xxxx工作中中”，然后在方法内依次调用work()，workContent(Content content)
PS：
xxx为变量name值，参数content需要自行创建并初始化变量bugContent与 moduleContent

④	定义测试类Test03，在main方法实现以下功能：
    创建并初始化一个Worker对象worker，调用方法 working(Workable wa)
    说明:
        (1)wa为Workable 的实现类对象，所以需要定义一个Workable接口的实现类WorkableImpl,
            需要实现void workContent(Content content)抽象方法，
        (2)该workContent抽象方法内部实现要求：调用参数content 的printContent()方法;
*/
public class Test03 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Workable wa = new WorkableImpl();
        worker.setName("张三");
        worker.setAge(18);
        worker.working(wa);
    }
}
