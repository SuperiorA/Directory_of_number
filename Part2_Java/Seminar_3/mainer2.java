package Part2_Java.Seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на
// экран.

public class mainer2 {
    public static void main(String[] args) {
        
        // int[] array = new int[10];
        // Random random = new Random();
        // for (int i = 0; i < array.length; i++) {
        //     array[i] = random.nextInt(100);
        //     System.out.print(array[i] + " ");
        // }
        // Arrays.sort(array);
        // System.out.println(Arrays.toString(array));


        // Второй способ через коллекции


        ArrayList <Integer> array1 = new ArrayList <Integer>();
        Random random = new Random();
            for (int i = 0; i < 10; i++) {
                array1.add(random.nextInt(100));
            }
        System.out.println(array1);
        Collections.sort(array1);
        System.out.println(array1);
    }
}
