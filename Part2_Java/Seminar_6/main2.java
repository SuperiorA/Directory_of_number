package Part2_Java.Seminar_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

// 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив и с
// помощью Set вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу: процент уникальных чисел = количество уникальных чисел * 100 / общее
// количество чисел в массиве.

public class main2 {
    public static void main(String[] args) {

        int[] array = fillArray(1000, 25);
        System.out.println("Массив случайных чисел: " + Arrays.toString(array));
        double result = uniqueDigit (array);
        System.out.println("Процент уникальных чисел: " + result + "%");
    }

    public static int[] fillArray(int size, int bound) {

        Random rnd = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(bound);
        }
        return array;
    }

    public static double uniqueDigit (int[] array) {

        Set <Integer> arraySet = new HashSet <>();
        for (int element : array) {
            arraySet.add(element);
        }
        double result = arraySet.size()* 100d / array.length;
        return result;
    }
}