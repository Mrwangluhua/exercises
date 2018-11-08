package test05;

public class test {
    public static void main(String[] args) {
        Manager man = new Manager();
        man.setBumen("销售部");
        man.setID("M001");
        man.setName("张小强");

        Clerk cle1 = new Clerk();
        cle1.setBumen("销售部");
        cle1.setID("C001");
        cle1.setName("李小亮");

        Clerk cle2 = new Clerk();
        cle2.setBumen("销售部");
        cle2.setID("C002");
        cle2.setName("赵亮");

        man.setC(cle1);
        man.setC(cle2);
        cle1.setManager(man);
        cle2.setManager(man);

        man.show();
        cle1.show();
        cle2.show();
    }
}
