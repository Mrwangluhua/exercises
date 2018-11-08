package test05;


public  class Employee {
    private String name;
    private String ID;
    private String bumen;

    public  void show(){
        System.out.println(bumen+"的："+name+",员工编号："+ID);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getBumen() {
        return bumen;
    }

    public void setBumen(String bumen) {
        this.bumen = bumen;
    }

    public Employee() {

    }

    public Employee(String name, String ID, String bumen) {

        this.name = name;
        this.ID = ID;
        this.bumen = bumen;
    }
}
