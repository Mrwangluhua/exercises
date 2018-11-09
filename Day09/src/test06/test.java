package test06;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Goods goods1 = new Goods("电脑","g10000",6999,1);
        Goods goods2 = new Goods("键盘","g10001",999,3);
        Goods goods3 = new Goods("鼠标","g10002",55,5);


        GouWuChe gouWuChe = new GouWuChe();
        System.out.println("===========添加商品==========");
        gouWuChe.add(goods1);
        gouWuChe.add(goods2);
        gouWuChe.add(goods3);
        System.out.println("您所选商品为:");
        gouWuChe.showGouWuChe();
        System.out.println("===========移除鼠标==========");
        System.out.println("请输入要移除的商品：");
        String str = sc.next();
        gouWuChe.remove(str);
        gouWuChe.showGouWuChe();
        double zongjia = gouWuChe.zongJia();
        System.out.println("总价为："+zongjia);
    }
}
