package Chapter13_Inheritance;

class MyString {

    public void display_length(String string){
        System.out.println("String length is: "+string.length());
    }
    public void toLower(String string){
        System.out.println("Your string in lowercase is: "+string.toLowerCase());
    }
    public void toUpper(String string){
        System.out.println("Your string in uppercase is: "+string.toUpperCase());
    }
}
public class MyStringTester{
    public static void main(String[] args) {
        MyString myString = new MyString();
        myString.display_length("vivek");
        myString.toLower("KUmAr");
        myString.toUpper("viVeK");
    }
}
