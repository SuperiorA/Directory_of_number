package Part2_Java.Seminar_4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 1) Написать метод, который принимает массив элементов, помещает их в стэк
// и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в
// очередь и выводит на консоль содержимое очереди.

public class mainer4 {
     public static void processArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // Помещаем элементы массива в стек
        for (int num : arr) {
            stack.push(num);
        }

        // Выводим содержимое стека на консоль
        System.out.println("Stack content:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void queueArray(int[] arr) {

        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i : arr) {
            queue.add(i);
        }
        System.out.println("Queue content:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        processArray(arr);
        queueArray(arr);
    }
}
