package test06;

public class Goods {
    private String name;
    private String id;
    private double price;
    private int nums;

    public Goods(String name, String id, double price, int nums) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.nums = nums;
    }

    public Goods(int nums) {
        this.nums = nums;

    }

    public void showGoods(){
        System.out.println("商品名称是："+name);
        System.out.println("\tID是："+id);
        System.out.println("\t价格是："+price);
        System.out.println("\t商品数目是："+nums);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    public Goods() {

    }
}
