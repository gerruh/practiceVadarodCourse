package practice.lessons.task9;

public class Car {
    private int id;
    private String brand;
    private int productionYear;
    private int maxSpeed;
    private int price;

    public Car(int id, String brand, int productionYear, int maxSpeed, int price) {
        this.id = id;
        this.brand = brand;
        this.productionYear = productionYear;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
