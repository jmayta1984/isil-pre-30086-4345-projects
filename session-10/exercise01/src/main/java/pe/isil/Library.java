package pe.isil;

import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getStock());
        }
    }

    public void sort() {
        if (books.size() == 1) {
            return;
        }

        for (int i = 0; i <= books.size() - 2; i++) {
            for (int j = i + 1; j <= books.size() - 1; j++) {
                    if (books.get(i).getStock()< books.get(j).getStock()){
                        Book aux = books.get(i);
                        books.set(i,books.get(j) );
                        books.set(j, aux);
                    }
            }
        }
    }
}
