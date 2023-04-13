package org.nejrasm.zadaca2oop.homeworktask1;

public class BookshelfMain {
    public static void main(String[] args) {
        final Bookshelf bookshelf = new Bookshelf();

        bookshelf.addBooks(new Books("The Grass is Always Greener", 1860920497, "Jeffrey Archer"));
        bookshelf.addBooks(new Books("Murder!", 1860920128, "Arnold Bennett"));
        bookshelf.addBooks(new Books("An Occurrence at Owl Creek Bridge One of the Missing", 1860920063, "Ambrose Bierce"));
        bookshelf.addBooks(new Books("A Boy at Seven Fear and Loathing in Aspen", 1860920225, "John Bidwell"));

        System.out.println(bookshelf.containsBook("Družba Pere Kvržice"));
        System.out.println(bookshelf.containsBook(1860920225));

        bookshelf.print();
    }
}
