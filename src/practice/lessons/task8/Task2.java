package practice.lessons.task8;

import java.io.*;
import java.util.*;

public class Task2 {

    static class Farm implements Externalizable {

        private String name;
        private String location;
        private int animalCount;
        private double area;
        private List<String> animals;

        public Farm() {
            System.out.println("Создаю пустую ферму...");
            this.animals = new ArrayList<>();
        }

        public Farm(String name, String location, int animalCount, double area) {
            this.name = name;
            this.location = location;
            this.animalCount = animalCount;
            this.area = area;
            this.animals = new ArrayList<>();
            System.out.println("Создана ферма: " + name);
        }

        public void addAnimal(String animalType) {
            if (animals != null) {
                animals.add(animalType);
                System.out.println("Добавлено животное: " + animalType);
            }
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            System.out.println("Записываю ферму '" + name + "' в файл...");

            out.writeUTF(name);
            out.writeUTF(location);
            out.writeInt(animalCount);
            out.writeDouble(area);

            out.writeInt(animals.size());
            for (String animal : animals) {
                out.writeUTF(animal);
            }

            System.out.println("Успешно записано!");
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            System.out.println("Читаю ферму из файла...");

            name = in.readUTF();
            location = in.readUTF();
            animalCount = in.readInt();
            area = in.readDouble();

            int size = in.readInt();
            animals = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                animals.add(in.readUTF());
            }

            System.out.println("Успешно прочитано!");
        }

        @Override
        public String toString() {
            return "Ферма '" + name + "' {" +
                    "\n  Местоположение: " + location +
                    "\n  Количество животных: " + animalCount +
                    "\n  Площадь: " + area + " га" +
                    "\n  Виды животных: " + animals +
                    "\n}";
        }
    }

    public static void main(String[] args) {
        System.out.println("=== ПРОГРАММА ДЛЯ РАБОТЫ С ФЕРМАМИ ===\n");

        System.out.println("1. СОЗДАЕМ ПЕРВУЮ ФЕРМУ:");
        Farm Farm1 = new Farm("Солнечная долина", "Московская область", 150, 45.5);
        Farm1.addAnimal("Коровы");
        Farm1.addAnimal("Куры");
        Farm1.addAnimal("Свиньи");

        System.out.println("\n2. СОЗДАЕМ ВТОРУЮ ФЕРМУ:");
        Farm Farm2 = new Farm("Зеленые луга", "Краснодарский край", 200, 78.2);
        Farm2.addAnimal("Овцы");
        Farm2.addAnimal("Козы");
        Farm2.addAnimal("Лошади");

        System.out.println("\n3. НАШИ ФЕРМЫ ДО ЗАПИСИ В ФАЙЛ:");
        System.out.println(Farm1);
        System.out.println();
        System.out.println(Farm2);

        System.out.println("\n4. СОХРАНЯЕМ ФЕРМЫ В ФАЙЛ...");
        saveFarmsToFile("my_ferms.dat", Farm1, Farm2);

        System.out.println("\n5. ЧИТАЕМ ФЕРМЫ ИЗ ФАЙЛА...");
        Farm[] loadedFerms = loadFarmsFromFile("my_ferms.dat");

        System.out.println("\n6. НАШИ ФЕРМЫ ПОСЛЕ ЧТЕНИЯ ИЗ ФАЙЛА:");
        if (loadedFerms != null) {
            for (Farm Farm : loadedFerms) {
                System.out.println(Farm);
                System.out.println();
            }
        }

        System.out.println("=== ПРОГРАММА ЗАВЕРШЕНА ===");
    }

    public static void saveFarmsToFile(String filename, Farm... ferms) {
        System.out.println("Начинаю запись в файл: " + filename);

        try {
            FileOutputStream fileStream = new FileOutputStream(filename);
            ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);

            objectStream.writeInt(ferms.length);
            System.out.println("Будет записано ферм: " + ferms.length);

            for (Farm Farm : ferms) {
                objectStream.writeObject(Farm);
            }

            objectStream.close();
            fileStream.close();

            System.out.println("Все фермы успешно сохранены в файл!");

        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static Farm[] loadFarmsFromFile(String filename) {
        System.out.println("Начинаю чтение из файла: " + filename);

        try {
            FileInputStream fileStream = new FileInputStream(filename);
            ObjectInputStream objectStream = new ObjectInputStream(fileStream);

            int count = objectStream.readInt();
            System.out.println("В файле найдено ферм: " + count);

            Farm[] ferms = new Farm[count];

            for (int i = 0; i < count; i++) {
                ferms[i] = (Farm) objectStream.readObject();
                System.out.println("Прочитана ферма №" + (i + 1));
            }

            objectStream.close();
            fileStream.close();

            System.out.println("Все фермы успешно прочитаны из файла!");
            return ferms;

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при чтении из файла: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
