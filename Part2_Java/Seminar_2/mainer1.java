// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1

package Part2_Java.Seminar_2;

import java.util.Scanner;

public class mainer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("int N: ");
        int n = scanner.nextInt();
        String str1 = "c1";
        String str2 = "c2";
        // System.out.print(getStringFromChars(n, str1, str2));


         // Третий вариант решения


         String result = (str1 + str2).repeat(n / 2);
         System.out.println(result);
         scanner.close();
    }

    // public static String getStringFromChars(int n, String str1, String str2) {

    //     String result = "";
    //     for (int i = 0; i < n; i++) {
    //         if (i % 2 == 0) {
    //             result += str1;
    //         }
    //         else {
    //             result += str2;
    //         }
    //     }
    //     return result;
    // }


    // Второй вариант решения
    
    
    // public static String getStringFromChars(int n, String str1, String str2) {

    //     if (n <= 0 || n % 2 == 1) {
    //         System.out.println("Не валидное значение");
    //     }

    //     StringBuilder sb = new StringBuilder();       
    //     for (int i = 0; i < n / 2; i++) {
    //             sb.append(str1).append(str2);
    //     }
    //     return sb.toString();
    // }

}
