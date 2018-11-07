package test05;

import java.util.ArrayList;
import java.util.Scanner;

/*
* 请编写程序，将键盘录入的字符串中敏感字符过滤掉，并测试。
例： 敏感字： 奥巴马、普京
键盘输入: 我喜欢奥巴马呀，还喜欢普京
打印输出: 我喜欢 * 呀，还喜欢 *
*/
public class Filter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            System.out.println("请输入一个字符串：是否退出");
            String str = sc.next();
            if ("是".equals(str)) {
                break;
            }
            list.add(str);
        }
        System.out.println("过滤掉的敏感字为：");
        String target1 = sc.next();
        System.out.println("过滤掉的敏感字为：");
        String target2 = sc.next();
        ArrayList<String> st = filter(list, target1, target2);
        System.out.println("过滤后的字符串为：");
        System.out.println(st);
    }

    private static ArrayList<String> filter(ArrayList<String> list, String target1, String target2) {
        ArrayList<String> ls = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String st = (list.get(i).replace(target1, "***"));
            st = st.replace(target2, "***");
            ls.add(st);
        }
        return ls;
    }
}