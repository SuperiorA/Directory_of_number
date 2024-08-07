package Part2_Java.Seminar_4;

// В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.
// Отмена последней операции должна быть реализована следующим образом: 
// если передан оператор '<' калькулятор должен вывести результат предпоследней операции.

// calculate('+', 3, 7)
// calculate('+', 4, 7)
// calculate('<', 0, 0)
// // 10.0
// // 11.0
// // 10.0

// calculate('*', 3, 2)
// calculate('-', 7, 4)
// calculate('<', 0, 0)
// // 6.0
// // 3.0
// // 6.0
import java.util.ArrayDeque;
import java.util.Deque;

public class HW4_task3 {
    public static void main(String[] args) {
        int a, b, c, d, r, t;
        char op, op2, op3, undo;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '-';
            d = 7;
            undo = '<';
            op3 = '*';
            r = 10;
            t = 20;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
            op3 = args[7].charAt(0);
            r = Integer.parseInt(args[8]);
            t = Integer.parseInt(args[9]);
        }

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
        double result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        double result3 = calculator.calculate(op3, r, t);
        System.out.println(result3);
        double prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}

class Calculator {

    public Deque<Double> resultsStack = new ArrayDeque<>();
    public double prevResult;

    public double calculate(char op, int a, int b) {
        // Напишите свое решение ниже
        double result = 0;
        if (op == '+') {
            result = a + b;
        }
        else if (op == '-') {
            result = a - b;
        }
        else if (op == '*') {
            result = a * b;
        }
        else if (op == '/') {
            result = a / b;
            if (b == 0) {
                System.out.println("Не дели на 0 дружище");
            }
        }
        resultsStack.add(result);
        // System.out.println(resultsStack);
        if (op == '<') {
            result = resultsStack.removeLast();
            result = resultsStack.removeLast();
        }
        result = resultsStack.peekLast();
        return result;
        
    }
}


    