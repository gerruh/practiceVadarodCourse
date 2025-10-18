package practice.lessons.task4;

/*
1.5 Создать класс Многоквартирный жилой дом. Вопрос: От какого класса должен наследоваться Многоквартирный жилой дом. Поля, которые можно определить в Многоквартирном жилье: количество квартир.
 */

public class ResidentialBuilding extends CivilBuilding {

    private int numberOfFlats;

    public ResidentialBuilding(
            String street,
            String wallMaterial,
            int yearOfBuilding,
            String purpose,
            int numberOfFloors,
            int numberOfFlats
    ) {
        super(street, wallMaterial, yearOfBuilding, purpose, numberOfFloors);
        this.numberOfFlats = numberOfFlats;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ResidentialBuilding{");
        sb.append("super=").append(super.toString());
        sb.append("numberOfFlats=").append(numberOfFlats);
        sb.append('}');
        return sb.toString();
    }
}
