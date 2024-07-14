package Part2_Java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lection4 {
    public static void main(String[] args) {

        // Queue

        Queue <Integer> queue = new LinkedList <Integer> ();
    
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue); // [1, 2, 3, 4]
        int item = queue.remove();
        System.out.println(queue); // [2, 3, 4]
        queue.offer(2809);
        item = queue.remove();
        System.out.println(queue); // [3, 4, 2809]
        item = queue.remove();
        System.out.println(queue); // [4, 2809]
        item = queue.poll();
        System.out.println(queue); // [2809]

        // queue.add(1);
        // System.out.println(queue);
        // queue.remove();
        // queue.offer(2809);
        // System.out.println(queue);
        // queue.poll();
        // System.out.println(queue);


        // PriorityQueue


        // Наивысший приоритет имеет «наименьший» элемент.


        // Deque


        // Линейная коллекция, которая поддерживает вставку и удаление
        // элементов на обоих концах. 

       
        // Deque<Integer> deque = new ArrayDeque<>();
        // deque.addFirst(1);
        // System.out.println(deque);
        // deque.addLast(2);
        // System.out.println(deque);
        // deque.removeLast(); 
        // System.out.println(deque);
        // deque.offerFirst(10); 
        // System.out.println(deque);
        // deque.pollLast(); 
        // System.out.println(deque);
        // deque.getFirst(); 
        // System.out.println(deque);
        // deque.peekFirst();
        // System.out.println(deque);

    }
}
