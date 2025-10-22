package practice.lessons.task4;
//1.1 Создать класс Постройка (Building). Поля у класса Постройка: улица, материал стен, год постройки.

public class Building {
    private String street;
    private String wallMaterial;
    private int yearOfBuilding;

    public Building(String street, String wallMaterial, int yearOfBuilding) {
        this.street = street;
        this.wallMaterial = wallMaterial;
        this.yearOfBuilding = yearOfBuilding;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Building{");
        sb.append("street='").append(street).append('\'');
        sb.append(", wallMaterial='").append(wallMaterial).append('\'');
        sb.append(", yearOfBuilding=").append(yearOfBuilding);
        sb.append('}');
        return sb.toString();
    }
}
