package practice.lessons.task4;

/*
1.4 Создать класс Административном здание. Административное здание должно наследоваться от Гражданского здания. Поля, которые можно определить в Административном здании: назначение административного здания (офисное, кинотеатр, спортсооружение),число людей, на которое рассчитано здание.
 */

public class AdministrativeBuilding extends CivilBuilding {

    private String purpose;
    private int numberOfPeople;

    public AdministrativeBuilding(
            String street,
            String wallMaterial,
            int yearOfBuilding,
            String purpose,
            int numberOfFloors,
            String purpose1,
            int numberOfPeople
    ) {
        super(street, wallMaterial, yearOfBuilding, purpose, numberOfFloors);
        this.purpose = purpose1;
        this.numberOfPeople = numberOfPeople;
    }
}
