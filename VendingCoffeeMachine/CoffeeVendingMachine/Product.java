package CoffeeVendingMachine;


public class Product {
    private String name;
    private int volume;
    private int temperature;
    private double price;

    /**
     * Конструктор для кофемашины с параметрами
     * @param name
     * @param volume
     * @param temperature
     * @param price
     */
    public Product(String name, int volume, int temperature, double price) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // 
    /**
     * Метод вывода информации о напитке в кофемашине
     * @param Наименование
     * @param Объем
     * @param Температура
     * @param Цена
     */
    public String toString() {
        return String.format("%s : %s мл.: %s градусов: %s руб.", name, volume, temperature, price);
    } 
}
