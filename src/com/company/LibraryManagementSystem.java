package com.company;

import java.util.ArrayList;

class Book {
    public String name, author;
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name= " + name + '/' +
                ", author= " + author + '/' +
                '}';
    }
}
class MyLibrary {
    public ArrayList<Book> books;
    public MyLibrary(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book book) {
        System.out.println("The book has been added to the library");
        this.books.add(book);
    }public void issueBook(Book book, String issued_to) {
        System.out.println("The book has been issued from the library to " + issued_to);
        this.books.add(book);
    }
    public void returnBook(Book b) {
        System.out.println("The Book has been returned");
        this.books.add(b);
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        bk.add(new Book("Algorithms1","CLRS1"));
        bk.add(new Book("Algorithms2","CLRS2"));
        bk.add(new Book("Algorithms3","CLRS3"));
        MyLibrary l = new MyLibrary(bk);
        l.addBook(new Book("algo4","myAuthor"));
        System.out.println(l.books);
    }
}
