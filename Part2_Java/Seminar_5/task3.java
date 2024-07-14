package Part2_Java.Seminar_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

public class task3 {
    public static void main(String[] args) {
        
        String str = "<{a}+{(d*3)}>";
        System.out.println(str + " - " + isPair(str));
    }

    public static boolean isPair(String str) {

        Map <Character, Character> symbol = new HashMap<>();
        symbol.put('[',']');
        symbol.put('{','}');
        symbol.put('<','>');
        symbol.put('(',')');

        Stack <Character> lifo = new Stack<>();
        for (char i : str.toCharArray()) {
            if (symbol.containsKey(i)) {
                lifo.push(i);
            }
            else if (symbol.containsValue(i)) {
                if (!lifo.isEmpty() && symbol.get(lifo.getLast()) == i) {
                    lifo.pop();
                }
                else {
                    return false;
                }
            }
        }
        if (lifo.isEmpty()) {
            return true;
        }   
        else {
            return false;
        }
    }
}
