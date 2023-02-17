import java.util.Scanner;
public class lesson1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Hello World!");
        String name = iScanner.nextLine();
        System.out.printf("Salamaleykum, brat %s!", name);
        iScanner.close();
    }

}