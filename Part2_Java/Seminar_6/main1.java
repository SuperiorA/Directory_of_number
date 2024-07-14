package Part2_Java.Seminar_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5,
// 6, 3}. Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.

public class main1 {
    public static void main(String[] args) {
        
        Set <Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(3);
        System.out.println(set);

        var a = new LinkedHashSet<>(Arrays.asList(10,20,3,2,4,5,6,3));
        System.out.println(a);

        var b = new TreeSet<>(Arrays.asList(10, 20, 3, 2, 4, 5, 6, 3));
        System.out.println(b);

    }
}
