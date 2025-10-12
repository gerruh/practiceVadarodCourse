package practice.lessons.task3.oop.Util;

import java.util.ArrayList;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int publishingYear;
    private double price;

    public Book(int id, String name, String author, String publisher, int publishingYear, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.price = price;
    }

    public Book() {
    }

    public void info() {
        System.out.println("id = " + id + ", name = " + name + ", author = " + author + ", publisher = " + publisher + ", publishingYear = " + publishingYear + ", price = " + price);
    }

    public void changePrice(double newPrice) {
        this.price = newPrice;
    }

    //5	Создать метод в классе Book, который будет принимать массив книг и возвращать из массив книг, у которых год издания ниже переданной года в методе.
    public static Book[] bookArrayByPublishingYear(Book[] books, int publishingYear) {
        ArrayList<Book> filteredBooks = new ArrayList();

        for (Book book : books) {
            if (book.publishingYear < publishingYear) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks.toArray(new Book[filteredBooks.size()]);
    }

    //как я сделал
    public static Book[] removeById(Book[] books, int id) {

        for (int i = 0; i < books.length; i++) {
            if (books[i].id == id) {
                Book[] newBooks = new Book[books.length - 1];

                System.arraycopy(books, 0, newBooks, 0, i);

                System.arraycopy(books, i + 1, newBooks, i, books.length - i - 1);

                return newBooks;
            }
        }
        return books;
    }

    //как надо
    public Book[] chgBook(Book[] books, int establParam) {

        int count = 0;
        for (Book s : books) {
            if (s.publishingYear < establParam) {
                count++;
            }
        }
        int j = 0;
        Book booksResult[] = new Book[count];
        for (int i = 0; i < books.length; i++) {

            if (books[i].publishingYear < establParam) {
                booksResult[j] = books[i];
                j++;
            }
        }
        return booksResult;
    }
}