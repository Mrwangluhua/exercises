package test03;

import java.util.Scanner;

/*
* 键盘录入QQ号码，验证格式的正确性。
- 必须是5—12位数字。
- 0不能开头。
*/
public class qqChack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的qq号码");
        String qq = sc.next();
        boolean f = chack(qq);
        System.out.println("这个qq号码是否正确："+f);
    }
    private static boolean chack(String qq){
        char[] ch = qq.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>'9'||ch[i]<'0'){
                return false;
            }
        }
        if(ch.length<5||ch.length>12){
            return false;
        }
        if(ch[0]=='0'){
            return false;
        }
            return true;
    }
}
