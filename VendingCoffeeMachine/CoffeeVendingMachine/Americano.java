package CoffeeVendingMachine;

public class Americano extends Drink{
    public Americano(String name, int volume, int temperature, double price) {
        super(name, volume,temperature, price);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Americano: ");
        res.append(super.toString());

        return res.toString();
    }
    
}
