package practice.lessons.task3.oop;
/*
1	Создать класс Book c полями id (тип int), name (тип String), author (тип String),
издательство ( тип String ), Год издания(тип Int), Количество старниц (тип int),
цена (double).Инициализацию книги в классе main выполнять через конструктор с параметрами.
Также определите конструктор без параметров.

 */

import practice.lessons.task3.oop.Util.Book;

public class Task1 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Book myBook = new Book(
                1,
                "Триумфальная арка",
                "Э.М. Ремарк",
                "Эскмо",
                2015,
                15.00
        );
    }
}
