package Part2_Java.Seminar_3;

// Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел, реализует алгоритм сортировки слиянием. 
// Метод должен возвращать отсортированный массив.

// Пример: a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]

import java.util.Arrays;

    class MergeSort {
        public static int[] mergeSort(int[] a) {
            if (a.length <= 1) {
                return a;
            }

            int mid = a.length / 2;
            int[] left = Arrays.copyOfRange(a, 0, mid);
            int[] right = Arrays.copyOfRange(a, mid, a.length);

            return merge(mergeSort(left), mergeSort(right));     // отсортированный массив
        }

        private static int[] merge(int[] left, int[] right) {
            int[] result = new int[left.length + right.length];
            int i = 0, j = 0, k = 0;

            while (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    result[k] = left[i];
                    k++;
                    i++;
                } else {
                    result[k] = right[j];
                    k++;
                    j++;
                }
            }

            while (i < left.length) {                           // Копирование оставшихся элементов
                result[k] = left[i];
                k++;
                i++;
            }
            while (j < right.length) {
                result[k] = right[j];
                k++;
                j++;
            }
            return result;                                      // объединенный отсортированный массив
        }
    }
public class HW3_task1 { 

    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            a = new int[]{5, 1, 6, 2, 3, 4, 18, 9};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        int[] sortedArray = MergeSort.mergeSort(a);
        System.out.println(Arrays.toString(sortedArray));
        }
}


