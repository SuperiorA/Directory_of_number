package Part3_OOP.Seminar1.Vending;

public class Product {
    
    // Модификаторы доступа:

    // private - видимость только внутри текущего классаэ
    // public - видимость во всем проекте
    // пустота - видимость в рамках одного package, то есть одной папки (ещё один инструмент инкапсуляции) - используется редко
    // protected - новый тип доступа, который доступен в этом классе и в его наследниках - используется редко
    
    private String name;                       
    private double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Инкапсуляция - ограничение доступа, сокрытие работы класса от пользователя
    public String getName() {
        return name;
    }
    // public void setName(String name) {      // Закоментим сеттеры и переопределим конструктор в нашем классе Product на 8 строчке
    //     this.name = name;                   // Обращение именно к этой переменной, только внутри этого класса
    // }
    public double getPrice() {
        return price;
    }
    // public void setPrice(double price) {
    //     this.price = price;
    // }

    @Override                                   // Функциональный комментарий, который не может игнорировать компилятор
    public String toString() {                  // Переопределяет метод, КОТОРЫЙ РАНЕЕ УЖЕ СУЩЕСТВОВАЛ!!!
        // return super.toString();             // super - обращение к родительскому классу
        return ("name - " + name + ", price - " + price + " rub.");
    }
}
