package Exam04;
/*3.定义类Card
        (1)成员变量:
            用户名称 userName（String 型）
            用户密码 passWord（ String 型）
        (2)生成所有成员变量set/get方法,包含空参/满参构造*/
public class Card {
    private String userName;
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Card() {

    }

    public Card(String userName, String passWord) {

        this.userName = userName;
        this.passWord = passWord;
    }
}
