package Part2_Java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lection6 {
    public static void main(String[] args) {

        // Set<Integer> set = new HashSet<>();
        // set.add(1); set.add(12); set.add(123);                // Добавить в множество
        // set.add(1234); set.add(1234);       
        // System.out.println(set.contains(12));                 // Проверить, есть ли такое значение в множестве
        // set.add(null);
        // System.out.println(set.size());                   
        // System.out.println(set);                        
        // set.remove(12);                                       // Удалить эелемент 12
        // for (var item : set) System.out.print(item + " ");    // Синтаксис foreach  
        // set.clear();                                          // Обнулить множество
        // System.out.println();
        // System.out.println(set);                     
        

        // HashSet - множество ключей, без value.

        // isEmpty() – проверка на пустоту.
        // add(V) – добавление элемента в коллекцию.
        // remove(V) – удаление элемента из коллекцию.
        // contains(V) – проверка на включение элемента в коллекции.
        // clear() – удаление всех элементов коллекции.
        // size() – возвращает количество элементов коллекции.

        
        // HashSet как синоним множества

        // addAll(Coll) – объединение множеств.
        // retainAll(Coll) – пересечение множеств.
        // removeAll(Coll) – разность множеств.

        // var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
        // var b = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17));
        // var u = new HashSet<Integer>(a); u.addAll(b);
        // var r = new HashSet<Integer>(a); r.retainAll(b);        // в r покажи все элементы а, совпадающие c b
        // var s = new HashSet<Integer>(a); s.removeAll(b);        // удали все элемнты b, совпадающие с а
        // System.out.println(a); // [1, 2, 3, 4, 5, 6]
        // System.out.println(b); // [17, 2, 3, 5, 7, 11]
        // System.out.println(u); // [1, 17, 2, 3, 4, 5, 6, 11]
        // System.out.println(r); // [2, 3, 5, 7]
        // System.out.println(s); // [1, 4, 6]


        // TreeSet - коллекция, которая может отсоритровать данные.

        // var a = new TreeSet<>(Arrays.asList(1,7,2,3,6,4,5));
        // var b = new TreeSet<>(Arrays.asList(13,3,17,7,2,11,5));
        // System.out.println(a);                      
        // System.out.println(b); 
        // System.out.println(a.contains(1));                         // Есть ли в "а" элемент 1?


        // LinkedHashSet - запоминает порядок добавления данных в множество

        // isEmpty() – проверка на пустоту.
        // add(V) – добавление элемента в коллекцию.
        // remove(V) – удаление элемента из коллекцию.
        // contains(V) – проверка на включение элемента в коллекции.
        // clear() – удаление всех элементов коллекции.
        // size() – возвращает количество элементов коллекции.

        // var a = new LinkedHashSet<>(Arrays.asList(1,7,2,3,6,4,5));
        // var b = new LinkedHashSet<>(Arrays.asList(13,3,17,7,2,11,5));
        // a.add(28);
        // System.out.println(a);
        // System.out.println(b); 


        // Введение в ООП

        // Java является объектно-ориентированным языком.
        // Программа, написанная на Java, должна соответствовать
        // парадигме объектно-ориентированного программирования.
        // Следует понимать, что принципы ООП не просто определяют
        // структуру программы. Это некий фундаментальный подход,
        // с которым нам предстоит разобраться.
        // Спагетти-код – код, в котором данные связаны с методами
        // для их обработки и в итоге может получиться так, что отдельные
        // ветви алгоритма переплетаются, образуя запутанный клубок,
        // в котором невозможно разобраться

    }
}
