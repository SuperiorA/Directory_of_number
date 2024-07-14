package Part2_Java.Seminar_3;

// Реализуйте метод, который принимает на вход целочисленный массив arr:
// - Создаёт список ArrayList, заполненный числами из исходого массива arr.
// - Сортирует список по возрастанию и выводит на экран.
// - Находит минимальное значение в списке и выводит на экран - Minimum is {число} 
// - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
// - Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
// Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:

// Исходный массив: 4, 2, 7, 5, 1, 3, 8, 6, 9
// Результаты:     [1, 2, 3, 4, 5, 6, 7, 8, 9]
// Minimum is 1
// Maximum is 9

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Answers {
    public static void analyzeNumbers(Integer[] arr) {

      ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

      Collections.sort(list);
      System.out.println(list);

      int min = Collections.min(list);
      System.out.println("Minimum is " + min);

      int max = Collections.max(list);
      System.out.println("Maximum is " + max);

      double average = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
      System.out.println("Average is " + average);

  }
}

public class HW3_task3 { 
  public static void main(String[] args) { 
      Integer[] arr = {};

      if (args.length == 0) {
          
          arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
      } else {
          arr = Arrays.stream(args[0].split(", "))
                      .map(Integer::parseInt)
                      .toArray(Integer[]::new);
      }

      Answers.analyzeNumbers(arr);
  }
}