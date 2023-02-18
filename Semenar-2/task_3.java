// Полиндом

public class task_3 {
    public static void main(String[] args) {
    String s = "banicinabl";
    System.out.println(checkPolindrom(s));
    }

    private static Boolean checkPolindrom(String myString){
        char[] myCharArray = myString.toCharArray();
        int size = myString.length();
        for (int i=0; i<size/2;i++){
            if (myCharArray[i]!= myCharArray[size-i-1]){
                return false;
            }
        }
        return true;
    }

}
