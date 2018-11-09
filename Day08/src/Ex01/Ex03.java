package Ex01;
/*
* 根据传入的字符串，获取指定的字符串*/
public class Ex03 {
    public static void main(String[] args) {
        String name = "name";
        String name2 = "name";
        char[] st = {'a','b','c'};
        String s = st.toString();
        System.out.println(s.toString());
        name = getPropertyGetMethodName(name);
        System.out.println(name.toString());
        name2 = getPropertySetMethodName(name2);
        System.out.println(name2.toString());

    }
    private static String getPropertyGetMethodName(String property){
        String str = "get";
        char[] ch = property.toCharArray();
        ch[0]=(char)(ch[0]-32);
        for (int i = 0; i < ch.length; i++) {
            str+=ch[i];
        }
        return str;
    }
    private static String getPropertySetMethodName(String property){
        String str ="set";
        char[] ch = property.toCharArray();
        ch[0]=(char)(ch[0]-32);
        property = ch.toString();
        str = str.concat(property);
        return str;
    }
}
