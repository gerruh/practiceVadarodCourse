package practice.lessons.task9;

/*
1. Создать класс авто. Поля: id, марка, пробег, год выпуска, максимальная скорость, цена.
1.1 Создать коллекцию из авто.
1.2 Найти самую быструю машину.
1.3 Найти самую медленную машину.
1.4 Найти самую старую
1.5 Найти самую новую
1.6 Найти машины, у которых пробег от 50000 до 100000.
1.7 Найти самую дорогую машину.
1.8 Найти самую дешёвую машину.
1.9 Отсортировать машины по пробегу (по возрастанию и по убыванию
1.10 Отсортировать машины по стоимости (по возрастанию и по убыванию)
1.11 Найти машины в диапазоне пробега от 20000 до 100000 и в диапазоне цен от 10000 до 20000.
1.12 Получить не повторяющиеся значения марок авто (distinct).
1.13 Найти машину в задданом дипазоне цен, определённой марки, с заданным дипазоном пробега, в заданном диапазон год выпуска. Если таких нет, выбросить своё исключение.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        Car car1 = new Car(1,"BMW",2005,240,5000);
        Car car2 = new Car(2,"Audi",2006,270,7000);
        Car car3 = new Car(3,"Honda",2007,270,7000);


        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        Optional<Car> fastest = cars.stream()
                .max(Comparator.comparing(Car::getMaxSpeed));
        fastest.ifPresent(p ->
                System.out.println("Самая быстрая это " + p.getBrand() + " " + "со скоростью " + p.getMaxSpeed()));

        Optional<Car> slowest = cars.stream()
                .min(Comparator.comparing(Car::getMaxSpeed));
        slowest.ifPresent(p ->
                System.out.println("Самая медленная это " + p.getBrand() + " " + "со скоростью " + p.getMaxSpeed()));

        Optional<Car> oldest = cars.stream()
                .min(Comparator.comparing(Car::getProductionYear));
        slowest.ifPresent(p ->
                System.out.println("Самая старая это " + p.getBrand() + " " + "с годом выпуска " + p.getProductionYear()));

        Optional<Car> newest = cars.stream()
                .min(Comparator.comparing(Car::getProductionYear));
        slowest.ifPresent(p ->
                System.out.println("Самая новая это " + p.getBrand() + " " + "с годом выпуска " + p.getProductionYear()));

    }


}
