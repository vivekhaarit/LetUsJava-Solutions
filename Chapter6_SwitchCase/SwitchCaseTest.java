package Chapter6_SwitchCase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchCaseTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean keepPlaying = true;
        while (keepPlaying) {
            char ch = (char) bufferedReader.read();
            switch (ch) {
                case 65:
                    System.out.println("big A");
                    System.out.println((char) 65);
                    break;
                case 97:   System.out.println("small a");
                    System.out.println((char) 97);
                    break;
                default:
                    System.out.println("you entered something else.");
            }
            System.out.print("want to play once again? Press Y/N: ");
            char choice= (char)bufferedReader.read();
            if (choice=='n')
                keepPlaying= false;
        }
    }
}
