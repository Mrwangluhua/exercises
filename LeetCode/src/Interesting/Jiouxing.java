package Interesting;
/*
* 如何判断一个数的奇偶性
* 进行异或运算
* 原理是所有的数转成二进制后，末位总是1或者0
* 偶数必然是0，而奇数必然是1
* 然后对要判断的数与1 进行按位与&，0与1 按位与 结果是0，
* 只有两个数的相同位数都是1 结果才是1，即只要有0 ，按位与 就得0*/


public class Jiouxing {
    public static void main(String[] args) {
        int a = 6;
        boolean t = ToF(a);
        System.out.println(t);
    }
     private static boolean ToF(int a){
        return ((a&1)==1);
    }
}
