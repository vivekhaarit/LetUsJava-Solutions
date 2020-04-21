package Chapter12_StringsAndEnums;

import java.util.Scanner;

public class AbbriviatingTheName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] name = scan.nextLine().split(" ");
        String abbName="";
        for(int i=0;i<name.length-1;i++){
            abbName = abbName + name[i].toUpperCase().charAt(0)+".";
        }
        int end= name.length-1;
        name[end]=name[end].replace(name[end].charAt(0),name[end].toUpperCase().charAt(0));
        abbName=abbName+" "+name[end];
        System.out.println(abbName);
    }
}
