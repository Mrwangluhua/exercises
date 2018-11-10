package Exam08;
/*3. 定义表演接口(Actor)
        抽象方法:void play( Star star)
        默认方法:void level() 要求输出：“机会总是留给有准备的人”
        静态方法：void study() 要求输出：“敏而好学，不耻下问”*/
public interface Actor {
    public abstract void play(Star star);
    public default void level(){
        System.out.println("机会总是留给有准备的人");
    }
    public static void study(){
        System.out.println("敏而好学，不耻下问");
    }
}
