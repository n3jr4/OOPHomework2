package org.nejrasm.zadaca2oop.homeworktask1;

public class Books {
    private final String title;
    private final long ISBN;
    private final String author;

    public Books(final String title, final long ISBN, final String author) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public long getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return (this.title + "," + this.author + "(" + this.ISBN + ")");
    }
}
