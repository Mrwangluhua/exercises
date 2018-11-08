package test08;

import java.util.ArrayList;
import java.util.Scanner;

/*- 使用集合存储多个用户对象。
- 录入用户和密码，对比用户信息，匹配成功登录成功，否则登录失败。
- 登录失败时，当用户名错误，提示没有该用户。
- 登录失败时，当密码错误时，提示密码有误。*/

public class test {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        User user1 = new User();
        user1.setName("张三");
        user1.setPassword("123456");

        User user2 = new User("李四", "23456");
        User user3 = new User("王五", "2345678");
        User user4 = new User("赵四", "2345678");
        User user5 = new User("蒙仲", "23456gds78");
        User user6 = new User("赵奢", "234567sda8");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);

        System.out.println("请输入用户名：");
        String name = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        int ch = chack(users, name, password);
        if(ch ==0){
            System.out.println("用户名错误");
        }
        if(ch ==1){
            System.out.println(name+"=====恭喜登陆====");
        }
        if(ch ==2){
            System.out.println("密码错误");
        }
    }

    private static int chack(ArrayList<User> users, String name, String password) {
        int ch = 0;//没变的话，就是用户名错误
        for (int i = 0; i < users.size(); i++) {
            if (name.equals(users.get(i).getName())) {
                if (password.equals(users.get(i).getPassword())) {
                    ch = 1;//全部正确返回1
                } else {
                    ch = 2;//密码错误返回2
                }
            }
        }
        return ch;
    }
}