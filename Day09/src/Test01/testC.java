package Test01;

public class testC extends testB{
    int numc = 30;
    @Override
    public void showB() {
        System.out.println("B类中的numb："+numb);
    }

    @Override
    public void showA() {
        System.out.println("A类中的numa："+numa);
    }
    public void showC(){
        System.out.println("A类中的numa："+numc);
    }
}
