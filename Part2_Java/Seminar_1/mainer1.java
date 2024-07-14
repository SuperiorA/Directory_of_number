package Part2_Java.Seminar_1;

import java.util.Scanner;

public class mainer1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("int n: ");
        int n = iScanner.nextInt();                   // Считывание с консоли, как Console.ReadLine()
        iScanner.close();
        
        int result = subtractProductAndSum(n);
        System.out.println(result);
    }

    public static int subtractProductAndSum(int n) {

        if (1 <= n && n <= 100000) {
            int sum = 0;
            int pro = 1;
        
            while (n > 0) {
                int digit = n % 10;               
                pro *= digit; 
                sum += digit; 
                n /= 10;
            }

            return pro - sum;
        }
        return 0;
    }
}