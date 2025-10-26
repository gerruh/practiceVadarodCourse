package practice.lessons.task5;

public class Main {
    public static void main(String[] args) {
        run1();
    }

    public static void run1() {
        /*
1. Создать Интерфейс Электроприборы. В интерфейсе Электроприборы реализовать абстрактный метод:  work();
2. Создать дефолтный метод в интерфейсе Электроприборы., start() который выводит текст «Электроприбор стартует».
3. Создать класс Кофемашина. Поля наименование. Список функционала. Стоимость, Boolean isOn (включен) Класс кофемашина имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы методы выводил «Кофемашина варит кофе».
4. Создать класс Холодильник. Поля: наименование, марка, стоимость, Boolean isOn (включен). Класс холодильник имплементирует интерфейс Электроприборы. Переопределите метод work так, чтобы методы выводил «Холодильник морозит».
5. Создать класс Стиральная машина. Поля наименование, бренд, стоимость, Boolean isOn. Класс стиральная машина имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы метод выводил «Стиральная машина стирает».
6. Создать класс Пылесос. Поля наименование, бренд, стоимость, Boolean isOn. Класс Пылесос имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы метод выводил «Пылесос убирает».
7. В классе main cоздайте по паре объектов на основании вышесозданных классов. Создайте в классе main создайте выставку из электроприбров и продемонстрируйте способности каждого электроприбора
8. Создайте интерфейс Кухонная техника. От этого интерфейса выполните имплементацию у классов Холодильник и Стиральная машина
9.  В классе main сделать выставку только из Кухонной техники. Продемонстрировать спосбоности всех электроприборов в этой выставке.
10. В классе main сделать выставку кофемашин. Продемонстрировать способности всех кофе машин.
11. На любой кофемашине вызовете метод start(). После этого переопределите метод start так, чтобы этот метод включал прибор (менял значение Boolean isOn на true.) Выведите результат в консоль
 */


        Exhibition<Electrodevice> electrodevicesExhibition = new Exhibition<>();
        Exhibition<KitchenDevice> kitchenDevicesExhibition = new Exhibition<>();
        Exhibition<KitchenDevice> coffeemachineExhibition = new Exhibition<KitchenDevice>();

        String[] coffemachineFunctionality = {"Варить", "Самоотчистка", "Время"};

        Coffeemachine coffeemachine1 = new Coffeemachine(
                "Кофемашина 1",
                coffemachineFunctionality
        );
        electrodevicesExhibition.setElementToArray(coffeemachine1);

        Coffeemachine coffeemachine2 = new Coffeemachine(
                "Кофемашина 2",
                coffemachineFunctionality
        );
        electrodevicesExhibition.setElementToArray(coffeemachine2);

        Fridge fridge1 = new Fridge("Холодильник 1", "Samsung", 100.5);
        electrodevicesExhibition.setElementToArray(fridge1);
        kitchenDevicesExhibition.setElementToArray(fridge1);

        Fridge fridge2 = new Fridge("Холодильник 2", "Philips", 89.9);
        electrodevicesExhibition.setElementToArray(fridge2);
        kitchenDevicesExhibition.setElementToArray(fridge2);

        LaundryWasher laundryWasher1 = new LaundryWasher("Стиралка 1", "Bosh", 50.5);
        electrodevicesExhibition.setElementToArray(laundryWasher1);
        kitchenDevicesExhibition.setElementToArray(laundryWasher1);

        LaundryWasher laundryWasher2 = new LaundryWasher("Стиралка 2", "In", 50.5);
        electrodevicesExhibition.setElementToArray(laundryWasher2);
        kitchenDevicesExhibition.setElementToArray(laundryWasher2);

        VacuumCleaner vacuumCleaner1 = new VacuumCleaner(
                "Пылесос 1",
                "Dyson",
                200.0
        );
        electrodevicesExhibition.setElementToArray(laundryWasher1);

        VacuumCleaner vacuumCleaner2 = new VacuumCleaner(
                "Пылесос 2",
                "Xiaomi",
                30.0
        );
        electrodevicesExhibition.setElementToArray(laundryWasher2);

        System.out.println("Сейчас работает первый луп");

        for (Electrodevice element : electrodevicesExhibition.getList()) {
            element.work();
        }
    }

    public static void run2() {
        /*
1. Создать класс Персонаж. Поля Имя, фамилия.
2. Создать класс Студент. Поля факультет
3. Создать класс Сотрудник. Поля, зарплата
4. Создать класс Отдел. Имя id отдела. Отдела.
5. Создать класс стол. Этот класс будет состоять из двух дженериков. Первый дженерик будет отображать инвертарный номер стола(Integer), второй дженерик будет отображать персонажа, который за ним будет сидеть
6. Реализовать метод в классе стол, который будет выводить имя персонажа, который сидит за столом.
7. В классе main Создать три стола, за которыми будут сидеть студент и сотрудник.
8. Вывести поочередно  имена персонажей, которые сидят за столом.
 */

        Student student1 = new Student("Gera", "Gerruh", "Linguistics");
        Table<Integer, Character> table1 = new Table();

        table1.setCharacterAtTable(student1);
        table1.printCharacter();

        Table<Integer, Character> table2 = new Table(1, student1);
        table2.printCharacter();
    }
}
