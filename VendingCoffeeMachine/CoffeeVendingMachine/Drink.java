package CoffeeVendingMachine;


public class Drink extends Product {

    public Drink(String name, int volume, int temperature, double price) {
        super(name, volume, temperature, price);
    }
    @Override
    public String toString() {
        return String.format("Напитки : %s ", super.toString());
    }
    
}
