package test05;

public class Manager extends Employee {
    private Clerk c;

    public void show(){
        super.show();
        System.out.println("他的职员是："+c.getName());
    }

    public Clerk getC() {
        return c;
    }

    public void setC(Clerk c) {
        this.c = c;
    }

    public Manager() {

    }

    public Manager(String name, String ID, String bumen) {
        super(name, ID, bumen);
    }

    public Manager(Clerk c) {

        this.c = c;
    }

    public Manager(String name, String ID, String bumen, Clerk c) {
        super(name, ID, bumen);
        this.c = c;
    }
}
