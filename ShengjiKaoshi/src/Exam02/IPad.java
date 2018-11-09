package Exam02;
/*④ 定义类IPad，要求如下：
继承抽象类 Pad，实现接口 CarPlay
 	构造方法包括：空参构造和满参构造方法(String)
    重写抽象方法：
            void cpFunction()，要求：输出”支持CarPlay功能”
            void playMovie(Movie movie)，要求：输出打印"XXX IPad正在播放YYY主演的ZZZ电影"
PS：XXX是IPad类中的 name属性值，YYY是Movie 类中的 playerName属性值，ZZZ是Movie 类中的 movieName属性值*/
public class IPad extends Pad implements CarPlay{

    public IPad() {
    }

    public IPad(String name) {
        super(name);
    }

    @Override
    public void cpFunction() {

    }

    @Override
    public void cpConnecting() {
        System.out.println("支持CarPlay功能");
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println(getName()+" IPad正在播放"+movie.getPlayName()+"主演的"+movie.getMovieName()+"电影");
    }
}
