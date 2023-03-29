package CoffeeVendingMachine;

import java.util.ArrayList;
import java.util.List;

public class CoffeeVendingMachine {
    private List<Product> products = new ArrayList<>();
    private double money = 0;

    public CoffeeVendingMachine addProduct(Product product) {
        products.add(product);
        return this;
    }
    public Product searchProduct(String name) {
        for (Product item : products) {
            if (item.getName().equals(name)) {
                return item;
            }
           
        }
       return null; 
    }


    /**
     * Метод продажи товара, увеличивает остаток в кассе
     * @param name
     * @return
     * @throws Exception
     */
    public Product sell(String name) throws Exception {
        Product target = searchProduct(name);
        try {

        this.money += target.getPrice();
        // System.out.println(target);   
        } catch (NullPointerException e) {
            // System.out.println("Товар не найден");
            throw new Exception("Такого напитка нет в продаже", e);
        }
        return target;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Product item : products) {
            res.append(item);
            res.append("\n");
        }
        res.append(String.format("В автомате сейчас %2f рублей", money));
        return res.toString();
    }
}

