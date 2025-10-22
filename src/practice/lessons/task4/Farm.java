package practice.lessons.task4;

/*
1.7. Создать класс ферма. опрос: От какого класса должна наследоваться Ферма. Поля, которые можно определить в Ферме: количество голов крупного рогатого скота, площадь пастбищ, выпускаемая продукция (может быть несколько, к примеру, молоко и мясо, пшеница, рожь).
Все поля должны быть с модификатором доступа private. Реализовывать методы getter и setter по необходимости. Инициализацию объекта производить через конструктор
 */

public class Farm extends IndustrialBuilding {

    private int numberOfAnimals;
    private double area;
    private String product;

    public Farm(
            String street,
            String wallMaterial,
            int yearOfBuilding,
            String sector,
            int numberOfAnimals,
            double area,
            String product
    ) {
        super(street, wallMaterial, yearOfBuilding, sector);
        this.numberOfAnimals = numberOfAnimals;
        this.area = area;
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Farm{");
        sb.append("super=").append(super.toString());
        sb.append("numberOfAnimals=").append(numberOfAnimals);
        sb.append(", area=").append(area);
        sb.append(", product='").append(product).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
