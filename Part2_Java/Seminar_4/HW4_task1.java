package Part2_Java.Seminar_4;

// Дан LinkedList с несколькими элементами разного типа. 
// В методе revert класса LLTasks реализуйте разворот этого списка без использования встроенного функционала.

// Пример
// Ввод
// [1, One, 2, Two]
// Вывод
// [1, One, 2, Two]
// [Two, 2, One, 1]

import java.util.LinkedList;

public class HW4_task1 {
    public static void main(String[] args) { 
        LinkedList<Object> ll = new LinkedList<>();

        if (args.length == 0 || args.length != 4) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
        } else {
            ll.add(Integer.parseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.parseInt(args[2]));
            ll.add(args[3]);
        }

        // LLTasks answer = new LLTasks();
        System.out.println(ll);
        LLTasks.revertLL(ll);
        System.out.println(ll);
    }
}

class LLTasks {
    public static void revertLL(LinkedList<Object> ll) {
        // Напишите свое решение ниже
        int size = ll.size();
        for (int i = 0; i < size / 2; i++) {
            Object temp = ll.get(i);
            ll.set(i, ll.get(size - 1 - i));                // На i-ое место поставь последний элемент
            ll.set(size - 1 - i, temp);
        }
    }
}

