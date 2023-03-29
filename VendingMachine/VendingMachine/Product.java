package VendingMachine;
import java.lang.reflect.Constructor;

public class Product {
    private String name;
    private double price;
    private int counter;

    public Product(String name, double price, int value) {
        this.name = name;
        this.price = price;
        this.counter = value;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public boolean sellCounter() {
        this.counter--;
        return counter > 0;
    }
    
    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }
    public int getValue() {
        return counter;
    }

    // private int setCounter(int counter) {
    //     this.counter = counter;
    // }

    @Override
    public String toString() {
        return String.format("%s : %.2f p.: %s шт.", name, price, counter);
    }
}
