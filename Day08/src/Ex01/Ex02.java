package Ex01;
/*
* 一、	需求说明：定义如下字符串：
String str = “javajfiewjavajfiowfjavagkljjava”;
二、	请分别定义方法统计出：
1.	字符串中：字符j的数量
2.	字符串中：字符串java的数量
*/
public class Ex02 {
    public static void main(String[] args) {
        String str = "javajfiewjavajfiowfjavagkljjava";
        String str1= "java";
        char ch = 'j';
        int a = jInString(str,ch);
        System.out.println(a);
        int b = javaInString(str,str1);
        System.out.println(b);
    }
    public static int jInString(String str,char ch){
        int count =0;
        char[] chr = str.toCharArray();
        for (int i = 0; i < chr.length; i++) {
            if(chr[i]==ch){
                count++;
            }
        }
        return count;
    }
    public static int javaInString(String str,String str1){
        String st = str.replace("java","");
        return (str.length()-st.length())/str1.length();
    }
}
