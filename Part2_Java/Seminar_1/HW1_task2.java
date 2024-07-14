package Part2_Java.Seminar_1;

public class HW1_task2{ 
    public static void main(String[] args) { 
               
            PrimeNums();
    }
                                 
    public static void PrimeNums(){                   
            for(int i = 2; i <= 1000; i++) {            // Перебираем числа от 2 до 1000
                if (isPrime(i)) {                       // Метод, вложенный в метод
                    System.out.print(i + " ");
                }
            }
        }
    
    private static boolean isPrime(int number) {         // Метод для проверки, является ли число простым
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
    }
}

