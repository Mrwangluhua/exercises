package Exam08;
/* a为Actor 的实现类，需要实现play(Star star)抽象方法，实现要求：调用参数star的work()方法;*/
public class A implements Actor {
    @Override
    public void play(Star star) {
        star.work();
    }
}
