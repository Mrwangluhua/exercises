package Test04;

public class Player {
    public  FightAble select(String str){
        if("法力角色".equals(str)) {
            return new Fashi();
        }
        if("战士角色".equals(str)) {
            return new Zhanshi();
        }
        return null;
    }
}
