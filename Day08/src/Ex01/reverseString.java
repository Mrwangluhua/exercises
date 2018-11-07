package Ex01;

import java.util.Scanner;

//反转键盘录入的字符串。
public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        String newStr="";
        char[] chr = str.toCharArray();
        for (int i = 0; i < chr.length; i++) {
            newStr = newStr.concat(chr[chr.length-1-i]+"");
        }
        System.out.println(newStr);
    }
}
