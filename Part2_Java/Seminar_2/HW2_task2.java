package Part2_Java.Seminar_2;

/* Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:
int[] arr - числовой массив
После каждого прохода по массиву ваш код должен делать запись в лог-файл 'log.txt' в формате год-месяц-день час:минуты 
{массив на данной итерации}. Для логирования использовать логгер logger класса BubbleSort.

Пример:

arr = new int[]{9, 4, 8, 3, 1};
sort(arr)

// При чтении лог-файла получим:
2023-05-19 07:53 [4, 8, 3, 1, 9]
2023-05-19 07:53 [4, 3, 1, 8, 9]
2023-05-19 07:53 [3, 1, 4, 8, 9]
2023-05-19 07:53 [1, 3, 4, 8, 9]
2023-05-19 07:53 [1, 3, 4, 8, 9]
*/

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

class BubbleSort {
  private static final String LOG = "log.txt";

  public static void sort(int[] arr) {
      
      try (FileWriter fileWriter = new FileWriter(LOG, false)) {   // Очистка лог-файла перед началом сортировки

      } catch (IOException e) {
          e.printStackTrace();
      }

      int n = arr.length;
      boolean swap;
      
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

      for (int i = 0; i < n - 1; i++) {                                 // Основной цикл пузырьковой сортировки
          swap = false;

          for (int j = 0; j < n - i - 1; j++) {
              if (arr[j] > arr[j + 1]) {
                  int temp = arr[j];                                    // Меняем местами соседние элементы, если выполняется условие
                  arr[j] = arr[j + 1];
                  arr[j + 1] = temp;
                  swap = true;
              }
          }

          logArray(arr, dateFormat);                                    // Логируем текущее состояние массива после каждой итерации
          if (swap == false) break;                                     // Если не было обменов, массив уже отсортирован
      }
  }

  private static void logArray(int[] arr, SimpleDateFormat dateFormat) {
      String currentTime = dateFormat.format(new Date());
      String arrayString = Arrays.toString(arr);
      try (FileWriter fileWriter = new FileWriter(LOG, true)) {
          fileWriter.write(currentTime + " " + arrayString + "\n");
      } catch (IOException e) {
          e.printStackTrace();
      }
  }
}

public class HW2_task2{ 
  public static void main(String[] args) { 
    int[] arr = {};
    
    if (args.length == 0) {
      arr = new int[]{9, 4, 8, 3, 1};
    } else {
      arr = Arrays.stream(args[0].split(", "))
                      .mapToInt(Integer::parseInt)
                      .toArray();
    }     

    BubbleSort.sort(arr);

    try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
          String line;
          while ((line = br.readLine()) != null) {
              System.out.println(line);
          }
      } catch (IOException e) {
          e.printStackTrace();
      }
  }
}