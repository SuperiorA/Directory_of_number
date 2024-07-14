package Part2_Java.Seminar_1;

public class HW1_task3 { 
    public static void main(String[] args) { 
        float a = 0;
        char op = ' ';
        float b = 0;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '*';
            b = 7;
            switch (op) {
                case '+', '-', '*', '/':
                    Calculator calculator = new Calculator();
                    float res = calculator.result(op, a, b);
                    System.out.println(res);
                    System.exit(op);
                default:
                    System.out.println("Некорректный оператор: 'оператор'");
            }
        } 
        else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }
    }
}

class Calculator {
    public float result(char op, float a, float b) {
      
        float result = 0;

        if (op == '+') {
                result = a + b;
            }
        else if (op == '-') {
                result = a - b;
            }
        else if (op == '/') {
                result = a / b;
            }
        else if (op == '*') {
                    result = a * b;
        }
        return result;
    }
}