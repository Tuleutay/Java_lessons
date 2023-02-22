
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex004 {

        public static void main(String[] args) {
            int day = 29;
            int month = 9;
            int year = 1990;
            Integer[] date = {day, month, year};
            List<Integer> d = new ArrayList<>(Arrays.asList(date));
            System.out.println(d); // [29, 9, 1990]
            d.add(0, 1990);
            d.add(2, 190);
            d.add(1, 10);
            System.out.println(d);
            System.out.println(d.get(2));
            d.remove(3);
            System.out.println(d);
            List<Integer> b = new ArrayList();
            b.add(10);
            b.add(52);
            b.add(15);
            b.add(1990);
            b.add(9);
            System.out.println(b);
            //d.void_sort(Comparator);
            System.out.println(d.subList(1,3));
            System.out.println(d.containsAll(b));
            b.retainAll(d);
            System.out.println(b);
        }
    }