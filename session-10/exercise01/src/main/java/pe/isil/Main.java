package pe.isil;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("Bibliotca Central");

        library.addBook(new Book("Conversación en la Catedral", "Mario Vargas Llosa", 5));

        library.addBook(new Book("Ciudad y los perros", "Mario Vargas Llosa", 10));

        library.addBook(new Book("Los últimos días de la prensa", "Jaime Bayly", 7));

        library.addBook(new Book("Cien años de soledad", "Gabriel García Marquez", 15));

        library.showBooks();

        library.sort();

        library.showBooks();

    }
}