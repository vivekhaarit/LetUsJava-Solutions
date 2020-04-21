package Chapter12_StringsAndEnums;

public class IndexOf2ndOccurenceInString {
    public static void main(String[] args) {
        int count=0,secondIndex=0;
        String s1="She sells sea shells on the sea shore";
        char[] characterArray = s1.toCharArray();
        for(int i=0;i<characterArray.length;i++){
            if(characterArray[i]=='s'){
                count++;
                if(count==2){
                    secondIndex=i;
                    break;
                }
            }
        }
        System.out.println("index of 2nd ocurence: "+secondIndex);
    }
}
