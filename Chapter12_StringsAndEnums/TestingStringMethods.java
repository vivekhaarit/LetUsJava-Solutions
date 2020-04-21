package Chapter12_StringsAndEnums;

public class TestingStringMethods {
    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    public static void main(String[] args) {
        String str1="vivek", str2= "kumar",str3;
        str3= str1.concat(str2);
        if(str3.contains("viv"))
            System.out.println(str3+" contains 'viv' ");
        System.out.println(str3);
        str3=str3.replace("viv","XXX");
        System.out.println(str3);
        char[] ch = {'a','b','c','d'};
        String string = String.copyValueOf(ch);
        System.out.println(string);
        String s=" ";
        if(s.isEmpty())
            System.out.println("string is empty");
        System.out.println("=============================");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        str3=str1.replace(str1.charAt(0),(char)32);
        System.out.println(str3);
    }
}
