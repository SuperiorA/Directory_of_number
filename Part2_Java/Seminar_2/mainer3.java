// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).

package Part2_Java.Seminar_2;

import java.util.Scanner;

public class mainer3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строка: ");
        String text = scanner.nextLine();
        // System.out.println(IsPali(text));
        scanner.close();


        // Второй вариант решения


        text = text.replaceAll("\\s", "").toLowerCase();  // regex удаление пробелов
        if (text.equals(new StringBuilder(text).reverse().toString())) {
            System.out.println("Pali");
        }
        else {
            System.out.println("Not Pali");
        }
    }

    // public static boolean IsPali(String text) {
    //     boolean flag = false;
    //     for (int i = 0; i < text.length() / 2; i++) {
    //         if (text.charAt(i) == text.charAt(text.length() - 1 - i)){
    //             flag = true;
    //         }
    //         else {
    //             break;
    //         }
    //     }
    //     return flag;
    // }
}
