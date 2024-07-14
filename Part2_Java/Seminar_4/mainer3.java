package Part2_Java.Seminar_4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная
// была первой в списке, а первая - последней.
// 3. Если введено revert, удаляет предыдущую введенную строку из памяти.

public class mainer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> deque = new ArrayDeque<>();
          

        System.out.println("Enter commands ('print', 'revert', or a string to add):");
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("print")) {
                // Печать строк в обратном порядке
                for (String s : deque) {
                    System.out.println(s);
                }
            } else if (input.equalsIgnoreCase("revert")) {
                // Удаление последней введенной строки
                if (!deque.isEmpty()) {
                    deque.pop();
                } else {
                    System.out.println("No strings to revert.");
                }
            } else {
                // Добавление новой строки в начало очереди
                deque.push(input);
            }
        }
    }
}
