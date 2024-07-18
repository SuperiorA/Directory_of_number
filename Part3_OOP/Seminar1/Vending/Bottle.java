package Part3_OOP.Seminar1.Vending;

public class Bottle extends Product {                           // После объявления расширяющего наследника класса Product нужно...
    
    private double volume;                   // Задали новую переменную ОБЪЁМА для продуктов типа Bottle

    public Bottle(String name, double price, double volume) {   // вызвать аргументы Product через super,чтобы всё заработало
        super(name, price);                                     // super всегда должен находиться на первой позиции!!!
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return super.toString() + ",volume - " + volume + " ml.";
    }
}
