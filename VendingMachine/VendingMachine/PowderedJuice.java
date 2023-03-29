package VendingMachine;

public class PowderedJuice extends Juice{
    public PowderedJuice(String name, double price, int value) {
        super(name, price, value);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Порошок: ");
        res.append(super.toString());

        return res.toString();
    }    
}



