package practice.lessons.task5;

public class VacuumCleaner implements Electrodevice {
    private String name;
    private String brand;
    private double price;
    private boolean isOn;

    @Override
    public void work() {
        System.out.println("Пылесос работает");
    }

    public VacuumCleaner(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }
}
