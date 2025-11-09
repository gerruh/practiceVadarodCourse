package practice.lessons.task5;

public class Fridge implements Electrodevice,KitchenDevice {
    private String name;
    private String brand;
    private double price;
    private boolean isOn = false;

    @Override
    public void work() {
        System.out.println("Холодильник работает");
    }

    public Fridge(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }
}