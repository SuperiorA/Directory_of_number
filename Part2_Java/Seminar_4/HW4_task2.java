package Part2_Java.Seminar_4;

// В классе MyQueueInt реализуйте очередь для типа данных Integer с помощью LinkedList со следующими методами:

// enqueue() - помещает элемент в конец очереди
// dequeue() - возвращает первый элемент из очереди и удаляет его
// first() - возвращает первый элемент из очереди, не удаляя
// getElements() - возвращает все элементы в очереди
// Пример:
// queue.enqueue(1);
// queue.enqueue(10);
// queue.enqueue(15);
// queue.enqueue(5);
// System.out.println(queue.getElements()); 
// Результат:[1, 10, 15, 5]

// queue.dequeue();
// queue.dequeue();
// System.out.println(queue.getElements());
// Результат: [15, 5]

// System.out.println(queue.first());
// Результат: 15

import java.util.LinkedList;

public class HW4_task2 {
    public static void main(String[] args) {

        MyQueueInt queue;
        queue = new MyQueueInt();

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}

class MyQueueInt {

    LinkedList<Integer> list = new LinkedList<>();

    public void enqueue(int element) {
        // помещает элемент в конец очереди
        list.addLast(element);
    }

    public int dequeue() {
        // возвращает первый элемент из очереди и удаляет его
        if (!list.isEmpty()) {
            return list.pollFirst();
        } else {
            throw new RuntimeException("Список пуст");
        }
    }

    public int first() {
        // возвращает первый элемент из очереди, не удаляя
        if (!list.isEmpty()) {
            return list.getFirst();
        } else {
            throw new RuntimeException("Список пуст");
        }
    }

    public LinkedList<Integer> getElements() {
        // возвращает все элементы в очереди
        return new LinkedList<>(list);
    }
}
