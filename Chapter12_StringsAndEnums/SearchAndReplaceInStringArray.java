package Chapter12_StringsAndEnums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchAndReplaceInStringArray {
    public static void main(String[] args) throws IOException {
        String[] str = {"I've to become mentally strong",
                        "Don't give up",
                        "just show up every day"};
        for(int i=0;i<str.length;i++)
            System.out.println(str[i]);
        String[] words;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two strings: ");
        String str1=bufferedReader.readLine();
        String str2=bufferedReader.readLine();
        System.out.println("checking if "+str1+" present in string array");
        /*int linesRead=0;
        boolean lineEnded=false;*/
        for(int i=0;i<str.length;i++){
            words = str[i].split(" ");
            for(int j=0;j<words.length;j++){
                if(str1.equals(words[j])){
                    System.out.println(str1+" is present in the "+(i+1)+" row\n it contained: "+str[i]);
                    System.out.println(words[j]+" is replaced by "+str2);
                    words[j]=str2;
                    String newSentence="";
                    for(int x=0;x<words.length;x++){
                        newSentence = newSentence + words[x]+" ";
                    }
                    str[i]=newSentence;
                }
            }
//            linesRead++;
        }
        /*if(linesRead==3) {
            System.out.println(str1 + " not present in string array");
            exit(1);
        }*/
        System.out.println("after replace that array became.");
        for(int i=0;i<str.length;i++)
            System.out.println(str[i]);

    }
}
