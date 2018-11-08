package test06;

import java.util.ArrayList;
import java.util.Scanner;

/*
* - 筛选字符串。
  - 定义ArrayList集合，存入多个字符串。
  - 删除长度大于5的字符串，打印删除后的集合。
- 开发提示:
  - 添加若干字符串到集合中
  - 遍历集合,不符合长度的字符串,移除.
*/
public class Filter {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入字符串，输入“否”退出：");
            String str = sc.next();
            if(str.equals("否")){
                break;
            }
            list.add(str);
        }
        System.out.println("请输入要删除的字符串长度：");
        int len = sc.nextInt();
        removes(list,len);
        System.out.println(list);
    }
    public static void removes(ArrayList<String> list,int length){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length()>5){
                list.remove(i--);
                //集合移除一个元素后，后面的元素全部会往前加一，
                //所以要进行i--，
            }
        }
    }
}
