// Дано четное число н и символы с1 и с2. Написать метод, который
// вернет строку длиной н, которая состоит из чередующихся символов с1 и с2, начиная с с1.
import java.util.Scanner;


public class semenar02 {
    public static void main(String[] args) {
        int n = getNum();
        char sym1 = 'g';
        char sym2 = 'w';

        System.out.println(makeString(n,sym1,sym2));

    }

    private static String makeString(int x, char c1, char c2){

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < x/2; i++){
           sb.append(c1).append(c2);
        }
        return sb.toString();
    }

    public static int getNum(){
        System.out.println("Input even number: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        return x;
    }
}
