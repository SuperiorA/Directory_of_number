// Напишите метод, который сжимает строку.
// Пример: вход aaaabbbcdd
// выход: abcd

package Part2_Java.Seminar_2;

import java.util.Scanner;

public class mainer2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        System.out.println(shortString(str));
        scanner.close();
     }

     public static String shortString(String str) {

        StringBuilder shorts = new StringBuilder();        // Метод для создания строки, в данном случае из char-ов
        shorts.append(str.charAt(0));
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                shorts.append(str.charAt(i + 1));
            }
        }
        return shorts.toString();                          // Конвертация char-овой строки в обычную строку, подметод Stringbuilder
     }
}
