package test08;

import java.util.ArrayList;

/*
* 模拟用户登录。
- 定义用户类，属性为用户名和密码。
- 使用集合存储多个用户对象。
- 录入用户和密码，对比用户信息，匹配成功登录成功，否则登录失败。
- 登录失败时，当用户名错误，提示没有该用户。
- 登录失败时，当密码错误时，提示密码有误。
*/
public class User {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String name, String password) {

        this.name = name;
        this.password = password;
    }

    public User() {

    }
}
