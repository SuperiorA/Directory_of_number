// Дана последовательность N целых чисел. 
// Найти количество положительных чисел, после которых следует отрицательное число.

package Part2_Java.Seminar_1;

import java.util.Scanner;

public class mainer2 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("int n: ");
        int n = iScanner.nextInt();  
        int count = getCount(iScanner, n);        
        System.out.println("count " + count);
    }

    private static int getCount(Scanner scanner, int n) {

        int count = 0;
        while (n > 0) {
            System.out.print("Введите число: ");
            int value = scanner.nextInt();
            if (value > 0) {
                count += 1;
                n -= 1;
            }
            else 
                break;
        }
        return count;
    }
}
