// Дана строка. Поменять местами ее половины.

package Part2_Java.Seminar_1;

public class mainer3 {
    public static void main(String[] args) {
        String str = "PROVIDER";
        String first = str.substring(0, str.length()/2);
        String second = str.substring(str.length()/2);
        String result = second + first;
        System.out.println("Reverse string - " + result);
    }
}
