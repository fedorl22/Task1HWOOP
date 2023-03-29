package VendingMachine;

public class Chocolate extends Product {
    private String taste;

    public Chocolate(String name, double price, String taste, int value) {
        super(name, price, value);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return String.format("Шоколад со вкусом %s, %s", taste, super.toString());
    }
}
