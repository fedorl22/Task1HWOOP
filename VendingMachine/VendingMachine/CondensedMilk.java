package VendingMachine;

public class CondensedMilk extends Milk {

    public CondensedMilk(String name, double price, int value) {
        super(name, price, value);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Сгущенка: ");
        res.append(super.toString());

        return res.toString();
    }
}
