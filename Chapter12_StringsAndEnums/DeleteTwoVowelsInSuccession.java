package Chapter12_StringsAndEnums;

import java.util.Scanner;

public class DeleteTwoVowelsInSuccession {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String outputFormat ="";
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        String sentence = scan.nextLine();
        int count=0;
        for(int i=0;i<sentence.length()-1;i++){
            for(int j=0;j<vowels.length;j++){
                if( sentence.charAt(i)==vowels[j])
                    for(int k=0;k<vowels.length;k++)
                        if(sentence.charAt(i+1)==vowels[k] ){
                            outputFormat = outputFormat + String.format("%s%s ",sentence.charAt(i),sentence.charAt(i+1));
                            count++;
                            i=i+1;
                }
            }
        }
        System.out.println(outputFormat);
        System.out.println(count);
    }
}
