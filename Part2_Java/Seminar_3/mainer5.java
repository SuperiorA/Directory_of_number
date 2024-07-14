package Part2_Java.Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

public class mainer5 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java","42","Python","36"));
        
        Iterator <String> iterator = list.iterator();
            while(iterator.hasNext()){
                String elem = iterator.next();
            try {
                Integer.parseInt(elem);
                iterator.remove();
            }
            catch (NumberFormatException ex){
            }
        }
        System.out.println("list = " + list);
    }
}
