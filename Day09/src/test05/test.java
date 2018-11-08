package test05;

public class test {
    public static void main(String[] args) {
        Manager man = new Manager();
        man.setBumen("销售部");
        man.setID("M001");
        man.setName("张小强");
        Clerk cle = new Clerk();
        cle.setBumen("销售部");
        cle.setID("C001");
        cle.setName("李小亮");
        man.setC(cle);
        cle.setManager(man);

        man.show();
        cle.show();
    }
}
