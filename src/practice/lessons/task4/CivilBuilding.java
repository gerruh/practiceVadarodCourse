package practice.lessons.task4;

/*
1.2 Создать класс Гражданские здания (CivilBuilding). Гражданские здания должны наследоваться от класса Постройка. Поля у класса Гражданские здания: назначение (жилье или общественные здания), количество этажей.
 */

public class CivilBuilding extends Building {

    private String purpose;
    private int numberOfFloors;

    public CivilBuilding(
            String street,
            String wallMaterial,
            int yearOfBuilding,
            String purpose,
            int numberOfFloors
    ) {
        super(street, wallMaterial, yearOfBuilding);
        this.purpose = purpose;
        this.numberOfFloors = numberOfFloors;
    }
}
