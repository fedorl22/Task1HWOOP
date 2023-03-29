package CoffeeVendingMachine;

public class main {
    public static void main(String[] args) {
        CoffeeVendingMachine drinks = new CoffeeVendingMachine();
        drinks.addProduct(new Espresso("Эспрессо", 50, 70, 50.0));
        drinks.addProduct(new Americano("Американо", 200, 70, 100.0));
        Sell(drinks, "Эспрессо");
        Sell(drinks, "Американо");
        Sell(drinks, "Бурда");
        System.out.println(drinks);
    }

    public static void Sell(CoffeeVendingMachine machine, String nameProd) {
        try {
            machine.sell(nameProd);
        } catch (Exception e) {
            System.out.println("Товар не найден");
           
        }

    }
}

        









