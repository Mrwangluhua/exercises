package test01;



public class Subject {
    private String ID;
    private String name;
    private String time;
    private String describe;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Subject() {

    }

    public Subject(String ID, String name, String time, String describe) {

        this.ID = ID;
        this.name = name;
        this.time = time;
        this.describe = describe;
    }
    public void showSubject(){
        System.out.println(ID+"\t\t"+name+"\t"+time+"\t"+describe);
    }
}
