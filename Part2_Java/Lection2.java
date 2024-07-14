package Part2_Java;

import java.io.File;

public class Lection2 {

    public static void main(String[] args) {

        // var s = System.currentTimeMillis();
        // String str = "";
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < 100000; i++) {
        //     // str += "+";
        //     sb.append("+");
        // }
        // System.out.println(System.currentTimeMillis() - s);
        // // System.out.println(str);
        // System.out.println(sb);

        // String[] name = { "C", "е", "р", "г", "е", "й" };
        // String sk = "СЕРГЕЙ КА.";
        // System.out.println(sk.toLowerCase());                                                       // сергей ка.
        // System.out.println(String.join("", name));                                                  // Cергей                    
        // System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));                          // Cергей
        // System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));                         // C,е,р,г,е,й


        // Работа с файловой системой. Файлы


        // File <имя> = new File(<полный путь к файлу>);
        // File f1 = new File("file.txt");
        // File f2 = new File("/Users/sk/vscode/java_projects/file.txt");


        // Нахождение полного пути к файлу 


        // String pathProject = System.getProperty("user.dir");
        // String pathFile = pathProject.concat("/file.txt");
        // File f3 = new File(pathFile);
        // System.out.println(f3.getAbsolutePath ());
        // // /Users/sk/vscode/java_projects/file.txt
        // // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt


        // Работа с файловой системой. Файлы. Ошибки


        // try {
        //     Код, в котором может появиться ошибка
        //    } catch (Exception e) {
        //     Обработка, если ошибка случилась
        //    }
        //    finally {
        //     Код, который выполнится в любом случае
        //    }


        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File f3 = new File(pathFile);
            System.out.println("try");
        } 
        catch (Exception e) {
            System.out.println("catch");
        }
        finally { 
            System.out.println("finally"); 
        }
           
    }
}

// concat(): объединение строк
// valueOf(): преобразует Object в строковое представление (завязан на toString())
// join(): объединяет набор строк в одну с учетом разделителя
// charAt(): получение символа по индексу
// indexOf(): первый индекс вхождения подстроки
// lastIndexOf(): последний индекс вхождения подстроки
// startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
// replace(): замена одной подстроки на другую
// trim(): удаляет начальные и конечные пробелы
// substring(): возвращает подстроку, см.аргументы
// toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
// сompareTo(): сравнивает две строки
// equals(): сравнивает строки с учетом регистра
// equalsIgnoreCase(): сравнивает строки без учета регистра
// regionMatches(): сравнивает подстроки в строках


// Работа с файловой системой


// isHidden(): возвращает истину, если каталог или файл является скрытым
// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения файла или каталога
// list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые находятся
// в определенном каталоге
// mkdir(): создает новый каталог
// renameTo(File dest): переименовывает файл или каталог
// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения
// файла или каталога
// list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые
// находятся в определенном каталоге
// mkdir(): создает новый каталог
// renameTo(File dest): переименовывает файл или каталог


// Логирование. Использование. Основы


// Использование
// Logger logger = Logger.getLogger()
// Уровни важности
// INFO, DEBUG, ERROR, WARNING и др.
// Вывод
// ConsoleHandler info = new ConsoleHandler();
// log.addHandler(info);
// Формат вывода: структурированный, абы как*
// XMLFormatter, SimpleFormatter


// Logger logger = Logger.getLogger(Ex0043.class.getName());
// logger.setLevel(Level.INFO);
// ConsoleHandler ch = new ConsoleHandler();                         // Вывод лога на консоль
// logger.addHandler(ch);
// //SimpleFormatter sFormat = new SimpleFormatter();                // Текстовый формат лога
// XMLFormatter xml = new XMLFormatter();                            // Кодированный формат лога
// //ch.setFormatter(sFormat);
// ch.setFormatter(xml);
// logger.log(Level.WARNING, "Тестовое логирование");
// logger.info("Тестовое логирование");