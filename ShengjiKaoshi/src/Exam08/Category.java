package Exam08;
/*
* 根据面向对象的要求，完成如下功能：
1. 定义抽象明星的类别类(Category)，包含空参、满参构造和以下成员变量
        编号id （int类型）
        姓名name (String类型)
        类别category（String类型）
        生成所有成员变量set/get方法
        抽象方法：  void work()*/
public abstract class Category {
    private int id;
    private String name;
    private String category;

    public abstract void work();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Category() {

    }

    public Category(int id, String name, String category) {

        this.id = id;
        this.name = name;
        this.category = category;
    }
}
