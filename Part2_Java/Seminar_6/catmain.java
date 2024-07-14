package Part2_Java.Seminar_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class catmain {
    public static void main(String[] args) {
        
        Cat cat1 = new Cat();
        cat1.id = 1;
        cat1.name = "Gav";
        cat1.age = 5;
        cat1.gender = "male";
        cat1.color = "black";

        Cat cat2 = new Cat();
        cat2.id = 2;
        cat2.name = "Mao";
        cat2.age = 6;
        cat2.gender = "female";
        cat2.color = "white";

       System.out.println(Arrays.asList(cat1, cat2));

       Set <Cat> cats = new HashSet<>(Arrays.asList(cat1, cat2));
       System.out.println(cats);
       System.out.println(cat1.equals(cat2));

       HashSet <Cat> cats2 = new HashSet<>();
       Long start = System.currentTimeMillis();
       for (int i = 0; i < 10000; i++) {
            cats2.add(new Cat());
       }
       Long end = System.currentTimeMillis();
       System.out.println(end - start);
       start = System.currentTimeMillis();
       for (int i = 0; i < cats2.size(); i++) {
            cats2.contains(i);                                           // contains идёт по хэшкодам
       }
       end = System.currentTimeMillis();
       System.out.println(end - start);
    }
}   
