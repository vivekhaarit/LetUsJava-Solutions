package Chapter6_SwitchCase;

//import myUtils.Utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import static myUtils.Utility.factorial;

public class ExerciseQuestions {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean keepPlaying = true;
        while(keepPlaying != false){
            System.out.println("1.Factorial\n2.Check Armstrong\n3.exit");
            System.out.print("enter your choice: ");
            int choice = Integer.parseInt(bufferedReader.readLine());
            switch (choice){
                case 1:
                    System.out.print("enter no whose factorial you want to calculate: ");
                    int n = Integer.parseInt(bufferedReader.readLine());
                    int fact = 0;//factorial(n);
                    System.out.println("factorial of "+n+": "+fact);
                    break;
                case 2:
                    System.out.print("enter the no: ");
                    n = Integer.parseInt(bufferedReader.readLine());
                    boolean armstrong = true;//Utility.checkArmstrong(n);
                    if (armstrong)
                        System.out.println("Number is armstrong.");
                case 3:keepPlaying=false;
            }
        }
    }
}
