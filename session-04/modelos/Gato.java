package modelos;

public class Gato {
    /*
     * Atributos
     */

    private String nombre;
    private int edad;
    private String raza;

    /*
     * Getters & setters
     */

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    /*
     * Constructor
     */

    public Gato(String nombre, int edad, String raza){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    /*
     * Métodos
     */

     public void maullar() {
        System.out.println(nombre + " está maullando.");
     }
}
