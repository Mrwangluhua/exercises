package Exam02;
/*
* ③定义类Movie
       包含空参、满参构造和以下成员变量
演员名称 playerName（String 型）
电影名称 movieName（ String 型）
        生成所有成员变量set/get方法*/
public class Movie {
    private String playName;
    private String movieName;

    public String getPlayName() {
        return playName;
    }

    public void setPlayName(String playName) {
        this.playName = playName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Movie() {

    }

    public Movie(String playName, String movieName) {

        this.playName = playName;
        this.movieName = movieName;
    }
}
