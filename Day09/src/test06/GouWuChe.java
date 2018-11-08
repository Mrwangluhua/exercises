package test06;

import javax.xml.bind.annotation.XmlElementDecl;
import java.util.ArrayList;

public class GouWuChe {
    ArrayList<Goods> Glist = new ArrayList<>();

    public void add(Goods g){
        Glist.add(g);
    }
    public GouWuChe() {
    }
    public void showGouWuChe(){
        for (int i = 0; i < Glist.size(); i++) {
            Goods goods = Glist.get(i);
            goods.showGoods();
        }
        System.out.println();
    }
    public void remove(String str){
        for (int i = 0; i < Glist.size(); i++) {
            Goods goods = Glist.get(i);
            if(str.equals(goods.getName())){
                Glist.remove(goods);
            }
        }
    }
    public double zongJia(){
        double zongjia=0;
        for (int i = 0; i < Glist.size(); i++) {
            Goods goods = Glist.get(i);
            zongjia +=goods.getPrice()*goods.getNums();
        }
        return zongjia ;
    }
}
