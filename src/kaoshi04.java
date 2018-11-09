public class kaoshi04 {
    public static void main(String[] args) {
        int b = test(634,456);
        System.out.println(b);
    }
    public static int test(int x, int y){
            return (x&y)+((x^y)>>1);
    }
}
