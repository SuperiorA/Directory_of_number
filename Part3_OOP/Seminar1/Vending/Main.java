package Part3_OOP.Seminar1.Vending;

public class Main {
    public static void main(String[] args) {

        VendingMachine vm = new VendingMachine();

        Product product1 = new Product("Lays", 90);             // new - это и есть конструктор
        Product product2 = new Bottle("Cola", 95, 500);         
        Product product3 = new Product("Baunty", 100);         

        vm.addProduct(product1);
        vm.addProduct(product2);
        vm.addProduct(product3);

        System.out.println(vm);
    }
}
