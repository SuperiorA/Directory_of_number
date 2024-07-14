package Part2_Java.Seminar_3;

import java.util.ArrayList;
import java.util.List;


// Каталог товаров книжного магазина сохранен в виде двумерного
// списка List<ArrayList<String>> так, что на 0й позиции каждого
// внутреннего списка содержится название жанра, а на остальных
// позициях - названия книг. Напишите метод для заполнения данной
// структуры

public class mainer4 {
    public static void main(String[] args) {
        List<ArrayList<String>> biblio = new ArrayList<>();

    addReader(biblio, "Путешествия", new String[]{"Africa", "Asia", "America", "Europa"});
    addReader(biblio, "Пушкин", new String[]{"Евгений Онегин", "Капитанская дочка", "Сказка о рыбаке", "Царь Гвидон"});
    addReader(biblio, "Роман", new String[]{"Атлант расправил плечи", "Врата Рая", "Звездное небо", "Вечер"});
    for (ArrayList<String> janr : biblio) {
        System.out.println("Жанр = " + janr.get(0));
        System.out.println("Список книг " );
        for (int i = 1; i < janr.size(); i++) {
            System.out.print(janr.get(i) + "    ");
        }
        System.out.println();
    }

    }
    public static void addReader(List<ArrayList<String>> biblio, String janr, String[] bookName) {
        ArrayList <String> lists = new ArrayList<>();
        lists.add(janr);
        for (int i = 0; i < bookName.length; i++) {
            lists.add(bookName[i]);
        }
        biblio.add(lists);
    }
}
