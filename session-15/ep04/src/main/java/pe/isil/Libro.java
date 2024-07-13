package pe.isil;

public abstract class Libro implements Reservable {
    private String isbn;
    private String titulo;
    private String autor;
    
    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void imprimirInfo() {
        System.out.println("Datos de libro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
    }
}
