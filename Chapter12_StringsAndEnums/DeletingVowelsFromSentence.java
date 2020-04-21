package Chapter12_StringsAndEnums;

import java.util.Scanner;

public class DeletingVowelsFromSentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        sentence = sentence.replace("the","");
        System.out.println(sentence);
    }
}
