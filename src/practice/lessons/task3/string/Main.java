package practice.lessons.task3.string;
/*
1.	Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
2.	Распечатать последний символ строки. Используем метод String.charAt().
3.	Проверить, заканчивается ли ваша строка подстрокой “java!”. Используем метод String.endsWith().
4.	Проверить, начинается ли ваша строка подстрокой “Добро пож”. Используем метод String.startsWith().
5.	Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
6.	Найти позицию подстроки “Java” в строке “I like Java!!!”.
7.	Заменить все символы “а” на “о”.
8.	Преобразуйте строку к верхнему регистру.
9.	Преобразуйте строку к нижнему регистру.
10.	Вырезать строку Java c помощью метода String.substring().
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите заадчу: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Task1.run();
            case 2:
                Task2.run();
            case 3:
                Task3.run();
            case 4:
                Task4.run();
            case 5:
                Task5.run();
            case 6:
                Task6.run();
            case 7:
                Task7.run();
            case 8:
                Task8.run();
            case 9:
                Task9.run();
            case 10:
                Task10.run();
        }
    }
}
