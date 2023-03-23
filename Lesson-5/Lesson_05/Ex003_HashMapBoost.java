package Lesson_05;

import java.util.*;

public class Ex003_HashMapBoost {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(5,"five");
        Map<Integer,String> map2 = new HashMap<>(30);
        Map<Integer,String> map3 = new HashMap<>(30, 0.8f);
        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);
    }
}