package pe.isil;

public class Book {
    private String name;
    private String author;
    private int stock;
    
    public Book(String name, String author, int stock) {
        this.name = name;
        this.author = author;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    
}
