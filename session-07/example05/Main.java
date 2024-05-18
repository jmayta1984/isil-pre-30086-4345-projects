package example05;

public class Main {
    // Crear una clase que represente una biblioteca de libros.
    // Una biblioteca tiene un conjunto de libros.
    // Crear métodos de instancia que permitan agregar y remover libros de la
    // biblioteca.

    // Crear una clase que represente un libro.
    // Un libro tiene un nombre, un autor y una editorial.

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Los detectives salvajes", "Roberto Bolaño", "Alfaguara");

        Book book2 = new Book("Conversación en la Catedral", "Mario Vargas Llosa", "Six Barral");

        Book book3 = new Book("Cien años de soledad", "Gabriel García Marquez", "Planeta");

        Book book4 = new Book("La ciudad y los perros", "Mario Vargas Llosa", "Six Barral");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.removeBook(book1);
        library.showBooks();
    }

}
