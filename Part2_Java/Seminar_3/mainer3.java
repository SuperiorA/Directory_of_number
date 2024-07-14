package Part2_Java.Seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


// Заполнить список названиями планет Солнечной
// системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его
// повторений в списке

public class mainer3 {
    public static void main(String[] args) {
        
        List<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int n = scanner.nextInt();

        List<String> rndPlanets = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            rndPlanets.add(planets.get((int) ((Math.random() * planets.size()))));
        }
            
            Collections.sort(rndPlanets);
            System.out.println(rndPlanets);
            int count = 1;

        ArrayList <String> result = new ArrayList<>();    
        for (int i = 1; i < (rndPlanets.size()); i++) {
            if (rndPlanets.get(i) == (rndPlanets.get(i - 1))) {
                count++;

            } 
            else {
                result.add(rndPlanets.get(i-1) + " " + count + " раз");
                count = 1;
            }
        }
        result.add(rndPlanets.getLast() + " " + count + " раз");
        System.out.println(result);
        scanner.close();


// Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.

        List<String> uniqList = new ArrayList<>();
        for (int i = 1; i < rndPlanets.size(); i++) {
            if (!rndPlanets.get(i).equals(rndPlanets.get(i - 1))) {
                uniqList.add(rndPlanets.get(i - 1));
            }
        }
        uniqList.add(rndPlanets.getLast());
        System.out.println(uniqList);
    }
}
