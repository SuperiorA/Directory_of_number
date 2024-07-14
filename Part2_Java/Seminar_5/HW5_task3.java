package Part2_Java.Seminar_5;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HW5_task3 {
    public static void main(String[] args) {
        String name1;
        String name2;
        String name3;
        String name4;
        String name5;
      
        if (args.length == 0) {
            name1 = "El";
            name2 = "Elena";
            name3 = "Ena";
            name4 = "Ivan";
            name5 = "Iv";
        } else {
            name1 = args[0];
            name2 = args[1];
            name3 = args[2];
            name4 = args[3];
            name5 = args[4];
        }      
        NamesCounter namesCounter = new NamesCounter();

        namesCounter.addName(name1);
        namesCounter.addName(name2);
        namesCounter.addName(name3);
        namesCounter.addName(name4);
        namesCounter.addName(name5);

        namesCounter.showNamesOccurrences();
    }
}

class NamesCounter {
    HashMap<String, Integer> names = new LinkedHashMap<>();

    // Метод для добавления имени в HashMap
    public void addName(String name) {
        names.put(name, names.getOrDefault(name, 0) + 1);
    }

    // Метод для вывода содержимого HashMap
    public void showNamesOccurrences() {
        System.out.println(names);
    }
}