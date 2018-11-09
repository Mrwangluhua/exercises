package test07;

import java.util.Scanner;

/*
* - 模拟简单计算器，可以运算+，—，*，/，%。
  - 接收三个参数，一个整数，一个运算符，另一个整数。
  - 计算出运算结果。
  - 无法运算时，返回null。
  可以不需要用运算符进行加减乘除运算。
  需要用到位运算符。
*/
public class Opreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要运算的数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("请输入运算符：");
        String ch = sc.next();
        int result = operater(a,ch,b);
        System.out.println("结果是："+result);
    }
    public static int operater(int a, String ch,int b){
        int result = 0;
        switch (ch){
            case "+":
                result = a+b;
                break;
            case "-":
                result = a-b;
                break;
            case "*":
                result = a*b;
                break;
            case "/":
                result = a/b;
                break;
            default:
                break;
        }
        return result;
    }
}
