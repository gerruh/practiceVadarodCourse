package practice.lessons.task3.oop;

//4	В классе main создать массив из пяти книг

import practice.lessons.task3.oop.Util.Book;

public class Task4 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Book[] books = new Book[5];

        for (int i = 0; i < books.length; i++) {
            books[i] = new Book(
                    1,
                    "Триумфальная арка",
                    "Э.М. Ремарк",
                    "Эскмо",
                    2015,
                    15.00
            );

            System.out.println("Текущая книга " + (i+1));
            books[i].info();
        }
    }
}
