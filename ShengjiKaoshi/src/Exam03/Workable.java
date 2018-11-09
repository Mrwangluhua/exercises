package Exam03;
/*
* ①	 定义接口Workable，要求如下：
      定义抽象方法： void workContent(Content content)
      定义默认方法： void work()，要求输出：
                        "今天工作不努力"
                     	"明天努力找工作"*/
public interface Workable {
    public abstract void workContent(Content content);
    public default void work(){
        System.out.println("今天工作不努力，明天努力找工作");
    }
}
