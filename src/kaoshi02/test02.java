package kaoshi02;

import java.util.ArrayList;
import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> oushulist = new ArrayList<>();
        ArrayList<Integer> jishulist = new ArrayList<>();
        System.out.println("请输入8个300-400之间的数：");
        getArrayList(sc, list);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2 == 0){
                oushulist.add(list.get(i));
            }
            else{
                jishulist.add(list.get(i));
            }
        }
        System.out.println("偶数是："+oushulist);
        System.out.println("奇数是："+jishulist);
        System.out.println(list);
    }

    public static void getArrayList(Scanner sc, ArrayList<Integer> list) {
        int count = 1;
        while (true){
            System.out.println("第"+count+"个数是：");
            int num = sc.nextInt();
            if(num>=300&&num<=400){
                list.add(num);
                count++;
                if(count>8){
                    break;
                }
            }
        }
    }
}
