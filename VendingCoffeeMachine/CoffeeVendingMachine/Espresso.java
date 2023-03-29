package CoffeeVendingMachine;

public class Espresso extends Drink{
    public Espresso(String name, int volume, int temperature, double price) {
        super(name, volume,temperature, price);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Espresso: ");
        res.append(super.toString());

        return res.toString();
    }
}
