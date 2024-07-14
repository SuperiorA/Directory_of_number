package Part2_Java.Seminar_1;

public class HW1_task1 {  
    public static void main(String[] args) { 
      int n = 0;
      
      if (args.length == 0) {           // Если аргументы не переданы в main, то считываем с 8 строки
        n = 10;
      }
      else{
        n = Integer.parseInt(args[0]);
      }     
      
      Answer ans = new Answer(); 
      int result = ans.countTriangle(n);     
      System.out.println(result);
    }
}

    class Answer {
        public int countTriangle(int n){
          // Введите свое решение ниже
            int sum = 0;
            while (n > 0){
                sum += n;
                n -= 1;
            }
            return sum;
        }
    }
    
