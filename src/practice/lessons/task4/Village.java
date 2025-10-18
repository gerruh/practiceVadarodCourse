package practice.lessons.task4;

//1. Класс Деревня. Деревня будет состоять из построек. К постройкам относятся промышленные здания и гражданские. К промышленным зданиям будут относится заводы и фермы. К гражданским будут относится: административные здания, жилые здания.

/*
2.1  Создать спортсооружение, исполком, 3 жилых дома, 2 завода и две фермы. Значения придумать самим. Добавить эти объекты в деревню (реализовать метод по добавлению постройки в деревню) (должны придумать,как это сделать)

 */


public class Village {

    private IndustrialBuilding[] industrialBuildings = new IndustrialBuilding[0];
    private CivilBuilding[] civilBuildings = new CivilBuilding[0];

    public Village() {}

    public void addIndustrialBuilding(IndustrialBuilding buildingToAdd) {

        // создаём новый массив на 1 элемент больше
        IndustrialBuilding[] newArray = new IndustrialBuilding[industrialBuildings.length + 1];

        // копируем старые значения
        for (int i = 0; i < industrialBuildings.length; i++) {
            newArray[i] = industrialBuildings[i];
        }

        // добавляем новый элемент в конец
        newArray[industrialBuildings.length] = buildingToAdd;

        industrialBuildings = newArray;
    }

    public void addCivilBuilding(CivilBuilding buildingToAdd) {

        CivilBuilding[] newArray = new CivilBuilding[civilBuildings.length + 1];

        for (int i = 0; i < civilBuildings.length; i++) {
            newArray[i] = civilBuildings[i];
        }

        newArray[civilBuildings.length] = buildingToAdd;

        civilBuildings = newArray;
    }

    public void industrialBuildingsInfo() {
        for (IndustrialBuilding b : industrialBuildings) {
            System.out.println(b.toString());
        }
    }

    public void civilBuildingsInfo() {
        for (CivilBuilding c : civilBuildings) {
            System.out.println(c.toString());
        }
    }

    public void allBuildingsInfo() {
        industrialBuildingsInfo();
        civilBuildingsInfo();
    }

    public int countBuildings() {
        return industrialBuildings.length + civilBuildings.length;
    }
}