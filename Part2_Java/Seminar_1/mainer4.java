// Дан массив nums. Мы определяем текущую сумму массива как  runningSum[i] = sum(nums[0]…nums[i]).
// Вернуть текущую сумму nums.

package Part2_Java.Seminar_1;

import java.util.Scanner;

public class mainer4 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arraylength = iScanner.nextInt();
        int[] array = new int[arraylength];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите значение элемента: ");
            array[i] = iScanner.nextInt();
        }
        iScanner.close();
            
        for (int i = 0; i < array.length/2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                System.out.println("Несимметричный");
                return;
            }
        }
        System.out.println("Симметричный");
    }
}
