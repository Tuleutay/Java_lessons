////
//
//
//
//import java.awt.*;
//import java.util.*;
//import java.util.List;
//
//public class sem_03 {
//    Random random= new Random();
//    public static void main(String[] args) {
//        List<Integer> list1 = getList(7);
//        System.out.println(list1);
//        List<Integer> list2 = getList(6);
//        System.out.println(list2);
//        list1.retainAll(list2);
//        System.out.println(list1);
//        Iterator<Integer> av = new ListIterator<Integer>() {
//            @Override
//            public boolean hasNext() {
//                return false;
//            }
//
//            @Override
//            public Integer next() {
//                return null;
//            }
//
//            @Override
//            public boolean hasPrevious() {
//                return false;
//            }
//
//            @Override
//            public Integer previous() {
//                return null;
//            }
//
//            @Override
//            public int nextIndex() {
//                return 0;
//            }
//
//            @Override
//            public int previousIndex() {
//                return 0;
//            }
//
//            @Override
//            public void remove() {
//
//            }
//
//            @Override
//            public void set(Integer integer) {
//
//            }
//
//            @Override
//            public void add(Integer integer) {
//
//            }
//        }
//
//    }
//
//
//    public static List<Integer> getList(int size){
//        Random random= new Random();
//        List<Integer> list = new ArrayList();
//        for (int i=0; i<size; i++){
//            int a = random.nextInt(0,5);
//            list.add(a);
//        }
//        return list;
//    }
//
////    public static List<Integer> get_subsequence(List<Integer> lst1, List<Integer> lst2){
////        List<Integer> all = new ArrayList();
////        all =
////
////                System.out.println(lst1.retainAll(lst2));
////
////    }
//}
