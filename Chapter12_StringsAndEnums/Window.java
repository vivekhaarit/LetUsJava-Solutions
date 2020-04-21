package Chapter12_StringsAndEnums;

import java.io.File;

enum Win{
    cursorType,windowColour
}
public class Window {
    private int height,width;
    private Win win;

    public Window(Win win) {
        this.win = win;
    }

    public void setDimensions(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void printValues() {
        System.out.println("window nature: "+win);
        System.out.println("Height: "+height);
        System.out.println("Width: "+width);
    }

    public static void main(String[] args) {
        File f= new File("abx.txt");
        Window window1 = new Window(Win.cursorType);
        Window window2 = new Window(Win.windowColour);
        window1.setDimensions(23,44);
        window2.setDimensions(11,33);
        window1.printValues();
        System.out.println("=====================================");
        window2.printValues();
    }

}
