package Part2_Java;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lection1 {
    public static void main(String[] args) {
        // System.out.println("Hello world");
        // float value = 212.21f; // В типе данных float/double в конце числа нужно
        // поставить суффикс f или d соответственно
        // double d = 323.321d;
        // System.out.println(d);
        // System.out.println(value);
        // int i = 123;
        // System.out.println(Integer.MAX_VALUE);

                // Строки не так просты

        // System.out.println(getType(d)); // Тип данных выводится через метод getType с
        // 13-14 строк!

        // String s = "goal";
        // System.out.println(s.length()); // Длина строки
        // boolean b = s.length() >= 4 && s.charAt(3) == 'l'; // && - быстрое И, если
        // первое условие ложно, дальше он не проверяет.
        // System.out.println(b); // & - даже, если первое ложно, то всё равно проверяет
        // второе.
        // // Для оператора ИЛИ (|| и |) логика точно такая же.

                // Массивы

        // int[] arr = new int[10];
        // System.out.println(arr[3]);
        // int[] array = new int[] {1, 2, 4, 5, 7, 8, 9, 10};
        // System.out.println(array.length);

                // Многомерные массивы

        // int[] arr2[] = new int[3][5]; // Можно записывать так - int[][] arr2 =
        // for (int[] line: arr2) {
        // for(int item: line) {
        // System.out.printf("%d", item);
        // }
        // System.out.println();
        // }

                // Получение данных из терминала

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s!", name);
        // iScanner.close();

                // Примитиные примеры с интовыми значениями.

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // int x = iScanner.nextInt();
        // System.out.printf("double a: ");
        // double y = iScanner.nextDouble();
        // System.out.printf("%d + %f = %f", x, y, x + y);
        // iScanner.close();

                // Проверка на соответствие получаемого типа

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // boolean flag = iScanner.hasNextInt();
        // System.out.println(flag);
        // int i = iScanner.nextInt();
        // System.out.println(i);
        // iScanner.close();

                // Форматированный вывод

        // String s = "tir";
        // int a = 15;
        // String res = a + s;                         // НЕ ДЕЛАТЬ ТАКИЕ ОПЕРАЦИИ КОНКАТИНАЦИИ!!! Переписать, если есть в коде
        // System.out.println(res);

        // int a = 1, b = 2;
        // int c = a + b;
        // System.out.printf("%d + %d = %d \n", a, b, c); // Прямой вывод
        // String res = String.format("%d + %d = %d \n", a, b, c); // Вывод черехзметод
        // формат. %d - вид спецификатора
        // System.out.println(res);

                // Виды спецификаторов

        // %d: целочисленных значений
        // %x: для вывода шестнадцатеричных чисел
        // %f: для вывода чисел с плавающей точкой
        // %e: для вывода чисел в экспоненциальной форме, например, 3.1415e+01
        // %c: для вывода одиночного символа
        // %s: для вывода строковых значений

                // Число чифр после запятой

        // float pi = 3.1415f;
        // System.out.printf("%f\n", pi); // 3,141500
        // System.out.printf("%.2f\n", pi); // 3,14
        // System.out.printf("%.3f\n", pi); // 3,141
        // System.out.printf("%e\n", pi); // 3,141500e+00
        // System.out.printf("%.2e\n", pi); // 3,14e+00
        // System.out.printf("%.3e\n", pi); // 3,141e+00

                // Условные конструкции

        // int a = 1;
        // int b = 2;
        // int c;
        // if (a > b) {
        // c = a;
        // }
        // else {
        // c = b;
        // }
        // System.out.println(c);

                // Аналогичная запись

        // int a = 15;
        // int b = 2;
        // int c = 0;
        // if (a > b) c = a;
        // if (b > a) c = b;
        // System.out.println(c);

                // Тернарный оператор - ?

        // int a = 11;
        // int b = 2;
        // int min = a < b ? a : b; // Если верно, то в min запиши а, если нет то b
        // System.out.println(min);

                // Оператор выбора switch, непонятен пока что

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("mounth: ");
        // int mounth = iScanner.nextInt();
        // String text = "";
        // switch (mounth) {
        // case 1:
        // text = "Autumn";
        // break;

        // default:
        // text = "mistake";
        // break;
        // }
        // System.out.println(text);
        // iScanner.close();

                // Циклы

        // int s = 1;
        // for (int i = 1; i <= 6; i++) {
        //     s *= i;
        // }
        // System.out.println(s);                  // Факториал нашёл через цикл!

                // Работа с файлами

        try (FileWriter fw = new FileWriter("file.txt", false)) {
        fw.write("line 1");
        fw.append('\n');
        fw.append("2 Line");
        fw.append('\n');
        fw.write("line 3");
        fw.flush();
        }   
        
        catch (IOException ex) {
        System.out.println(ex.getMessage());
        }
    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}
