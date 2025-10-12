package practice.lessons.task3.oop;

//5	Создать метод в классе Book, который будет принимать массив книг и возвращать из массив книг, у которых год издания ниже переданной года в методе.

import practice.lessons.task3.oop.Util.Book;

public class Task5 {
    public static void main(String[] args) {
        run();
    }

    //моё
    public static void run() {
        Book[] books = new Book[5];

        Book bookOne = new Book(
                1,
                "Триумфальная арка",
                "Э.М. Ремарк",
                "Эскмо",
                2000,
                15.00
        );
        books[0] = bookOne;

        Book bookTwo = new Book(
                2,
                "На западном фронте без перемен",
                "Э.М. Ремарк",
                "Эскмо",
                2005,
                30.00
        );
        books[1] = bookTwo;

        Book bookThree = new Book(
                3,
                "Возвращение домой",
                "Э.М. Ремарк",
                "Эскмо",
                2010,
                45.00
        );
        books[2] = bookThree;

        Book bookFour = new Book(
                4,
                "Ночи в Лиссабоне",
                "Э.М. Ремарк",
                "Эскмо",
                2015,
                60.00
        );
        books[3] = bookFour;

        Book bookFive = new Book(
                5,
                "Время жить",
                "Э.М. Ремарк",
                "Эскмо",
                2020,
                75.00
        );
        books[4] = bookFive;

        Book[] filteredBooks = Book.bookArrayByPublishingYear(books,2015);

        for (Book book : filteredBooks) {
            book.info();
        }
    }
}
