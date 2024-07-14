package Part2_Java.Seminar_5;

import java.util.HashMap;
import java.util.Map;

// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
// и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
// некоторую букву во втором слове, при этом
// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
// порядка следования. (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true

public class task2 {
    public static void main(String[] args) {

        System.out.println("Слова изоморфные? - " + areIsomorphic("add", "egg"));
        System.out.println("Слова изоморфные? - " + areIsomorphic("wolk", "terr"));
        System.out.println("Слова изоморфные? - " + areIsomorphic("frogg", "tromb"));
    }

    public static boolean areIsomorphic(String s1, String s2) {

        if (s1.length() != s2.length()){
            return false;
        }

        Map <Character, Character> words = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char bukva = s1.charAt(i);
            char bukva2 = s2.charAt(i);
            if (!words.containsKey(bukva)) {                    // Если ключ не содержится, мы его добавляем
                words.put(bukva, bukva2);
            }
            else {
                if (words.get(bukva) != (bukva2)) {
                    return false;
                }
            }                        
        }
        return true;
    }
}