package Part2_Java.Seminar_2;

/*Дана строка sql-запроса:

select * from students where "
Сформируйте часть WHERE этого запроса, используя StringBuilder. 
Данные (параметры) для фильтрации приведены в виде json-строки в примере ниже. 
Если значение null, то параметр не должен попадать в запрос.
Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:

String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами
Пример: Строка sql-запроса:

select * from students where 
Параметры для фильтрации:

 {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Результат:

select * from students where name='Ivanov' and country='Russia' and city='Moscow'
*/

class Answer {  
    public static StringBuilder answer(String QUERY, String PARAMS) {
        
        PARAMS = PARAMS.replaceAll("[{}\"]", "");       // Удаляем фигурные скобки и пробелы
        String[] paramsArray = PARAMS.split(",\\s*");

        StringBuilder sb = new StringBuilder(QUERY);
        boolean firstCondition = true;

        for (String param : paramsArray) {                                // Берем каждый элемент массива по очереди
            String[] keyValue = param.split(":");
            String key = keyValue[0].trim();                              // Удаление пробелов в начале и конце строки
            String value = keyValue[1].trim();

            if (!value.equals("null")) {                         // Проверяем, что значение не "null"
                if (firstCondition == false) {
                    sb.append(" and ");
                }
                sb.append(key).append("='").append(value).append("'");
                firstCondition = false;
            }
        }
        return sb;
    }
}

public class HW2_task1 { 
    public static void main(String[] args) { 
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        } else {
            QUERY = args[0];
            PARAMS = args[1];
        }     
      
        System.out.println(Answer.answer(QUERY, PARAMS));
    }
}