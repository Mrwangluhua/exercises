package Interesting;

/*交换两个数*/
public class Swap {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        swap2(a, b);
        swap1(a,b);
    }

    //使用异或运算符 ^
    /*          0^1 = 1
                1^0 = 1
                0^0 = 0
                1^1 = 0
                进行两个数的异或运算，首先把他们转成二进制，
                同一位上如果相同则为1
                如果不同则为0；
    * */
    private static void swap1(int a, int b) {
        a = b ^ a;
        b = b ^ a;
        a = b ^ a;
        sout(a,b);
    }

    //用两个数的加减法进行交换
    private static void swap2(int a, int b) {
        a = b - a;
        b = b - a;
        a = b + a;
        sout(a, b);
    }

    private static void sout(int a, int b) {
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

}
