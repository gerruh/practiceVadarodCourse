package practice.lessons.task3.oop;

import practice.lessons.task3.oop.Util.Book;

public class Task2 {
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

        myBook.info();
    }
}
