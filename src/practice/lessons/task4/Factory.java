package practice.lessons.task4;

/*
1.6 Создать класс фабрика. Вопрос: От какого класса должна наследоваться Фабрика. Поля, которые можно определить в Фабрике: количество работников, выпускаемая продукция (запчасти, полиэтилен и т.д.)
 */

public class Factory extends IndustrialBuilding {

    private int numberOfEmployees;
    private String product;

    public Factory(
            String street,
            String wallMaterial,
            int yearOfBuilding,
            String sector,
            int numberOfEmployees,
            String product
    ) {
        super(street, wallMaterial, yearOfBuilding, sector);
        this.numberOfEmployees = numberOfEmployees;
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Factory{");
        sb.append("super=").append(super.toString());
        sb.append("numberOfEmployees=").append(numberOfEmployees);
        sb.append(", product='").append(product).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
