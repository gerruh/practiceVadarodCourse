package practice.lessons.task4;

//1. Класс Деревня. Деревня будет состоять из построек. К постройкам относятся промышленные здания и гражданские. К промышленным зданиям будут относится заводы и фермы. К гражданским будут относится: административные здания, жилые здания.

public class Task1 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {

        Village village = new Village();

        CivilBuilding sportCenter = new CivilBuilding(
                "Griboedova",
                "Stone",
                1999,
                "Sports",
                3
        );

        ResidentialBuilding residentialBuilding1 = new ResidentialBuilding(
                "Pobedy",
                "Stone",
                2005,
                "Residential",
                9,
                540
        );

        ResidentialBuilding residentialBuilding2 = new ResidentialBuilding(
                "Tesly",
                "Paper",
                2020,
                "Residential",
                16,
                750
        );

        ResidentialBuilding residentialBuilding3 = new ResidentialBuilding(
                "Tesly",
                "Paper",
                2020,
                "Residential",
                16,
                750
        );

        Factory factory1 = new Factory(
                "Aviatora",
                "Alluminium",
                2015,
                "Defense",
                1000,
                "Tanks"
        );

        Factory factor2 = new Factory(
                "Lesnika",
                "Stone",
                2005,
                "Food",
                3000,
                "Meat"
        );

        Farm farm1 = new Farm(
                "Moloka",
                "Wood",
                1990,
                "Dairy",
                25,
                35.5,
                "Milk"
        );

        Farm farm2 = new Farm(
                "Yaytsevo",
                "Wood",
                2007,
                "Food",
                80,
                90,
                "Chicken"
        );

        village.addCivilBuilding(sportCenter);
        village.addCivilBuilding(residentialBuilding1);
        village.addCivilBuilding(residentialBuilding2);
        village.addCivilBuilding(residentialBuilding3);
        village.addIndustrialBuilding(factory1);
        village.addIndustrialBuilding(factor2);
        village.addIndustrialBuilding(farm1);
        village.addIndustrialBuilding(farm2);

        village.allBuildingsInfo();
        System.out.println(village.countBuildings());
    }
}

