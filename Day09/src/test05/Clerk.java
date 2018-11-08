package test05;

class Clerk extends Employee {
    private Manager manager;

    public void show(){
        super.show();
        System.out.println("他的部门经理是："+manager.getName());
    }

    public Clerk() {
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Clerk(String name, String ID, String bumen) {
        super(name, ID, bumen);
    }

    public Clerk(Manager manager) {

        this.manager = manager;
    }

    public Clerk(String name, String ID, String bumen, Manager manager) {
        super(name, ID, bumen);
        this.manager = manager;
    }
}
