package test03;

/*定义Teacher类，继承Person
1. 属性：学科
2. 构造方法：无参构造方法，有参构造方法
3. 成员方法：getXxx方法，setXxx方法，讲课方法
*/
public class Teacher extends Person {
        private String science;

    public String getScience() {
        return science;
    }

    public void setScience(String science) {
        this.science = science;
    }

    public Teacher(String name, int age, String science) {
        super(name, age);
        this.science = science;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String science) {

        this.science = science;
    }
    public Teacher(){

    }
    public void jiangke(){
        System.out.println(getName()+"老师，讲授"+science+"课");
    }
}
