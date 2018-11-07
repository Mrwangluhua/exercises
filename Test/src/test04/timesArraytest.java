package test04;

import java.util.Scanner;

public class timesArraytest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入第大字符串：");
        String bigStr = sc.nextLine();
        System.out.print("请输入第小字符串：");
        String smallStr = sc.nextLine();
        //方式一：替换删除法：replace(oldString,newString)
        //int count = getCount(bigStr, smallStr);

        // 方式二：查找截取法：indexOf和substring
        //int count = getCount2(bigStr, smallStr);

        // 方式三：改变查找起始索引：indexOf(String smallStr,int fromIndex)
        int count = getCount3(bigStr, smallStr);
        System.out.println("共出现的次数为：" + count);
    }


    public static int getCount(String bigStr, String smallStr) {
        //将大字符串中出现的小字符串用""替换掉，生成一个新的字符串
        String afterStr = bigStr.replace("heima", "");
        //将原来的大字符串的长度减去新字符串的长度然后除以小字符串的长度就是小字符串出现的次数
        return (bigStr.length() - afterStr.length()) / smallStr.length();

    }

    public static int getCount2(String bigStr, String smallStr) {
        //定义一个计数器用来统计小字符串出现的次数
        int count = 0;
        //定义一个变量用来记录小字符串出现的索引位置
        int index;
        //获取到小字符串出现的索引值之后判断是否为-1，如果为-1说明没有找到
        while ((index = bigStr.indexOf(smallStr)) != -1) {
            //满足条件就说明找到了，count+1;
            count++;
            //截取掉小字符串
            bigStr = bigStr.substring(index + smallStr.length());
            System.out.println("截取之后的大字符串变化：" + bigStr);
        }
        return count;
    }

    public static int getCount3(String bigStr, String smallStr) {
        int count = 0;
        int index = 0;
        //找到小字符串出现的首次位置之后，再从当前索引处往后找，依次找处所有的小字符串
        while ((index = bigStr.indexOf(smallStr, index)) != -1) {
            count++;
            //找到首次出现的位置后，从这个索引处之后找，所以索引值应该加上小字符串的长度
            index += smallStr.length();
        }
        return count;
    }

}
