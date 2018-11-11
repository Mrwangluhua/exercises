package Test04;

import java.util.Scanner;

/*- 定义接口FightAble：
  - 抽象方法：specialFight。
  - 默认方法：commonFight。
- 定义战士类：
  - 实现FightAble接口。
- 定义法师类：
  - 实现FightAble接口。
- 定义玩家类Player：
  - 成员方法：FightAble select(String str)，根据指令选择角色。
    - 法力角色，选择法师。
    - 武力角色，选择战士。
*/
public class Test04 {
    public static void main(String[] args) {
        Player player = new Player();
        Scanner sc = new Scanner(System.in);
        System.out.println("选择：");
        String str = sc.next();
        player.select(str).commonFight();
        player.select(str).specialFight();
        System.out.println("=============");
        System.out.println("选择：");
        String str2 = sc.next();
        player.select(str2).commonFight();
        player.select(str2).specialFight();
    }
}
