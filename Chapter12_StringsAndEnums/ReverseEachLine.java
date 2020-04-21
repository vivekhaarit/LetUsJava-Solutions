package Chapter12_StringsAndEnums;

public class ReverseEachLine {
    public static void main(String[] args) {
        String s[]={"to err is human...",
                    "but to really mess things up.",
                    "one needs to know java"};
        System.out.println("The actual contents are: ");
        for(int i=0;i<s.length;i++)
            System.out.println(s[i]);

        for(int i=0;i<s.length;i++){
            String reversedLine="";
            String[] words=s[i].split(" ");
            for(int j=words.length-1;j>=0;j--){
                reversedLine=reversedLine+words[j]+" ";
            }
            s[i]=reversedLine;
        }
        System.out.println("Reversed array is: ");
        for(int i=0;i<s.length;i++)
            System.out.println(s[i]);
    }
}
