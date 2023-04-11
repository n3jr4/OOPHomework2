package org.nejrasm.zadaca2oop.homeworktask1;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
    private final List<Books> booksList;

    public Bookshelf() {
        this.booksList = new ArrayList<>();
    }

    public void addBooks(final Books book) {
        booksList.add(book);
    }

    public boolean containsBook(final String title) {
        for (Books book : booksList) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsBook(final long ISBN) {
        for (Books book : booksList) {
            if (book.getISBN() == ISBN) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        System.out.println(booksList.toString());
    }
}
