package Part2_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class Lection3 {
    public static void main(String[] args) {


//      Object o = 2;
//      GetType(o);                             // java.lang.Integer
//      o = 1.2;
//      GetType(o);                             // java.lang.Double
//      }

//      static void GetType(Object obj) {
//          System.out.println(obj.getClass().getName());
//      }


        // Сложение типов


        // System.out.println(Sum(1, 2));
        // System.out.println(Sum(1.0, 2));
        // System.out.println(Sum(1, 2.0));
        // System.out.println(Sum(1.2, 2.1));
        // }
        // static int Sum(int a, int b) { ...                      // Для каждого нужно прописывать отдельные методы
        // }
        // static double Sum(double a, double b) { ...
        // }
        // static String Sum(String a, String b) { ...
        // }


        // А через Object нет


        // static Object Sum(Object a, Object b) {
        //     if (a instanceof Double && b instanceof Double) {
        //     return (Object)((Double) a + (Double) b);
        //     } else if(a instanceof Integer && b instanceof Integer) {
        //     return (Object)((Integer) a + (Integer) b);
        //     } else return 0;


        // Коллекции


        // List – пронумерованный набор элементов.
        // Пользователь этого интерфейса имеет точный контроль над тем, где в списке вставляется каждый элемент.
        // Пользователь может обращаться к элементам по их целочисленному индексу (позиции в списке) и искать элементы в списке.
        // ArrayList, LinkedList (Vector, Stack – устаревшие)


        // «Удобный массив» Разные способы создания


        // ArrayList<Integer> list1 = new ArrayList<Integer>();      //  < > - Это называется обобщение, обязательно указывать типы!
        // ArrayList<Integer> list2 = new ArrayList<>();             // Иначе получишь на выходе Raw type - сырые типы и проблемы!
        // ArrayList<Integer> list3 = new ArrayList<>(10);
        // ArrayList<Integer> list4 = new ArrayList<>(list3);


        // List <String> list = new ArrayList <String>();
        // list.add("2809");
        // list.add("string line");
        // for (Object o : list) {
        //     System.out.println(o);
        //     System.out.println(o.getClass().getName());
        // }


        // Коллекции. Функционал


        // add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
        // get(pos) – возвращает элемент из списка по указанной позиции
        // indexOf(item) – первое вхождение или -1
        // lastIndexOf(item) – последнее вхождение или -1
        // remove(pos) – удаление элемента на указанной позиции и его возвращение
        // set(int pos, T item) – gjvtoftn значение item элементу, который находится на позиции pos
        // void sort(Comparator) – сортирует набор данных по правилу
        // subList(int start, int end) – получение набора данных от позиции start до end
        // clear() – очистка списка
        // toString() – «конвертация» списка в строку
        // Arrays.asList – преобразует массив в список
        // containsAll(col) – проверяет включение всех элементов из col
        // removeAll(col) – удаляет элементы, имеющиеся в col
        // retainAll(col) – оставляет элементы, имеющиеся в col
        // toArray() – конвертация списка в массив Object’ов
        // toArray(type array) – конвертация списка в массив type
        // List.copyOf(col) – возвращает копию списка на основе имеющегося
        // List.of(item1, item2,...) – возвращает неизменяемый список


        // StringBuilder day = new StringBuilder("28");
        // StringBuilder month = new StringBuilder("9");
        // StringBuilder year = new StringBuilder("1990");
        // StringBuilder[] date = { day, month, year };
        // List<StringBuilder> d = Arrays.asList(date);
        // System.out.println(d);                                              // [29, 9, 1990]
        // date[1] = new StringBuilder("09");                                  // Меняем элемент массива и коллекция d обновляется
        // System.out.println(d);                                              // [29, 09, 1990]


        // Character value = null;
        // List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');      // нельзя удалить/добавить что-то
        // System.out.println(list1);
        // // list1.remove(1); // java.lang.UnsupportedOperationException
        // List<Character> list2 = List.copyOf(list1);
        // System.out.println(list2);


        // Итератор. Часто используемые методы.


        // hasNext(), next(), remove()
        // ListIterator<E> URL
        // hasPrevious(), E previous(), nextIndex(), previousIndex(), set(E e), add(E e)

        
        // List<Integer> list = List.of(1, 12, 123, 1234, 12345);
        // for (int item : list) {                                // прогон через for each
        //     System.out.println(item); 
        // }
        //     Iterator <Integer> col = list.iterator();        
        // while (col.hasNext()) {                                // "пока есть следующий"
        //     System.out.println(col.next());                    // печатай мне каждый элемент
        // }
       
    }    
}
