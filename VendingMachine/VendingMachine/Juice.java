package VendingMachine;

public class Juice extends Product{

    
    public Juice(String name, double price, int value) {
        super(name, price, value);
    }

    @Override
    public String toString(){
        return String.format("Сок : %s ", super.toString());
    }
}