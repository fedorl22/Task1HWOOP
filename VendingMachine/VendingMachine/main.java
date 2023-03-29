package VendingMachine;

public class main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.addProduct(new Milk("Moloko", 47.99, 4));
        vm.addProduct(new Bread("Хлебцы с луком", 22.99, 5));
        vm.addProduct(new Product("cheese", 39.99, 3));
        vm.addProduct(new CondensedMilk("Советская сгущенка", 122.49, 5));
        vm.addProduct(new Chocolate("Аленка", 57.99, "Ореховое", 2));
        vm.addProduct(new Juice("Манго", 40, 4));
        vm.addProduct(new Juice("Апельсиновый", 55.5, 2));
        vm.addProduct(new PowderedJuice("Зуко", 19.99, 4));
        vm.addProduct(new Product("Beer", 59.39, 3));

        System.out.println("До продажи");
        System.out.println(vm);
        System.out.println(vm.searchProduct("Moloko"));
        PrintSell( vm , "Moloko");
        PrintSell(vm, "Moloko");
        PrintSell(vm, "Moloko");
        PrintSell(vm, "Зуко");
        PrintSell(vm, "Апельсиновый");
        PrintSell(vm, "Апельсиновый");
        PrintSell(vm, "Апельсиновый");
        PrintSell(vm, "Манго");        
        System.out.println();
        System.out.println("После продажи");
        System.out.println(vm.searchProduct("Зуко"));
        System.out.println(vm);
        
    }

    public static void PrintSell (VendingMachine machine, String nameProd) {
        try {
            System.out.println(machine.sell(nameProd));
        } catch (Exception e) {
            System.out.println("Товар не найден");
        }
    }
}
