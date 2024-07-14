package Part2_Java;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lection5 {
    public static void main(String[] args) {

        // Map<Integer, String> db = new HashMap<>();              // Первая обертка для ключа, вторая для значения!!!
        // db.put(1, "один"); System.out.println(db);
        // db.put(2, "два"); System.out.println(db);
        // db.put(3, "три"); System.out.println(db);
        // db.put(31, "три один"); System.out.println(db);
        // db.put(13, "один три"); System.out.println(db);
        // db.put(null, "!null"); System.out.println(db);
        // db.put(null, null); System.out.println(db);


        // Основной функционал 

        // put(K,V) – добавить пару если или изменить значение,если ключ имеется.
        // putIfAbsent(K,V) – произвести добавление если ключ не найден.
        // get(K) - получение значения по указанному ключу.
        // remove(K) – удаляет пару по указанному ключу.
        // containsValue(V) – проверка наличия значения.
        // containsKey(V) – проверка наличия ключа.
        // keySet() – возвращает множество ключей.
        // values() – возвращает набор значений.

        // Map<Integer, String> db = new HashMap<>();
        // db.putIfAbsent(1, "один");
        // db.put(2, "два");
        // db.put(3, "три");
        // System.out.println(db);
        // for (var item : db.entrySet()) {
        //     System.out.printf("[%d - %s]\n", item.getKey(), item.getValue());
        // }


        // Выделение памяти под массив Map

        // Map<Integer,String> map1 = new HashMap<>();
        // Map<Integer,String> map2 = new HashMap<>(9);
        // Map<Integer,String> map3 = new HashMap<>(9, 1.0f);// Как только массив заполнен на 100%, удвой его
        

        // TreeMap

        // TreeMap<Integer,String> tMap = new TreeMap<>();
        // tMap.put(1,"один"); System.out.println(tMap);
        // // {1=один}
        // tMap.put(6,"шесть"); System.out.println(tMap);
        // // {1=один, 6=шесть}
        // tMap.put(4,"четыре"); System.out.println(tMap);
        // // {1=один, 4=четыре, 6=шесть}
        // tMap.put(3,"три"); System.out.println(tMap);
        // // {1=один, 3=три, 4=четыре, 6=шесть}
        // tMap.put(2,"два"); System.out.println(tMap);
        // // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}

        
        // Основные методы

        // put(K,V) get(K) remove(K) descendingKeySet(V)
        // descendingMap() tailMap() headMap() lastEntry() firstEntry()

        
        // LinkedHashMap
        // «Старший брат» коллекции HashMap, который все помнит…
        // Помнит порядок добавления элементов ➜ более медлительный

        // Map<Integer,String> linkmap = new LinkedHashMap<>();
        // linkmap.put(11, "один один");
        // linkmap.put(1, "два");
        // linkmap.put(2, "один");
        // System.out.println(linkmap); // {11=один один, 1=два, 2=один}


        // HashTable

        // «Устаревший брат» коллекции HashMap,
        // который не знает про null

        // Map<Integer,String> table = new Hashtable<>();
        // table.put(1, "два");
        // table.put(11, "один один");
        // table.put(2, "один");
        // System.out.println(table); // {2=один, 1=два, 11=один один}
        // // table.put(null, "один"); // java.lang.NullPointerException    

        
        // Итог

        // Переопределил equals – переопредели hashCode !!!
    }
}
