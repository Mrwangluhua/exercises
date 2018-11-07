package test04;

import java.util.Scanner;

/*
* 字符串查找。

- 键盘录入一个大字符串，再录入一个小字符串。
- 统计小字符串在大字符串中出现的次数

*/
public class timesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入大字符串：");
        String bigArray = sc.next();
        System.out.println("请输入小字符串：");
        String smallArray = sc.next();
        int times = chack1(bigArray,smallArray);
        System.out.println("小字符串"+smallArray+"，在大字符串中共出现"+times+"次");

    }
    private static int chack(String bigArray,String smallArray){
        int count = 0;
        int index = 0;
        while((index = bigArray.indexOf(smallArray,index))!=-1){
            count ++;
            index += smallArray.length();
        }
        return count;
    }
    public static int chack1(String bigArray,String smallArray){
        String str = bigArray.replace(smallArray,"");
        return (bigArray.length()-str.length())/smallArray.length();
    }
}
