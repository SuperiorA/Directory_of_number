package Part2_Java.Seminar_5;

import java.util.HashMap;
import java.util.Map;

// Написать метод, который переведет число из римского формата записи в арабский.
// Например, MMXXII = 2022
// I = 1; V = 5; X = 10; L = 50; C = 100; D = 500; M = 1000.

public class task4 {
    public static void main(String[] args) {
        String str = "MMXXII";
        System.out.println(str + " = " + convert(str));
    }

    public static int convert(String str) {
        Map <Character, Integer> digits = new HashMap<>();
        digits.put('I', 1);
        digits.put('V', 5);
        digits.put('X', 10);
        digits.put('L', 50);
        digits.put('C', 100);
        digits.put('D', 500);
        digits.put('M', 1000);
        int result = 0;
        for (Character i : str.toCharArray()) {
            if (digits.containsKey(i)) {
                result += digits.get(i);
                System.out.println(result);
            }
        }
        return result;
    }
}
