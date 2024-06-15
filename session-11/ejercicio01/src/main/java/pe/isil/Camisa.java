package pe.isil;

public class Camisa {

    private int id;
    private String modelo;
    private String talla;
    private double precio;

    /* Sobrecarga de constructores */

    public Camisa(int id, String modelo, String talla, double precio) {
        this.id = id;
        this.modelo = modelo;
        this.talla = talla;
        this.precio = precio;
    }

    public Camisa(int id, String modelo, String talla) {
        this.id = id;
        this.modelo = modelo;
        this.talla = talla;
        this.precio = 0;
    }

    /* Getters & setters */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /* Sobrescritura */
    @Override
    public String toString() {
        return "{id: " + id + " - modelo: " + modelo + " - precio: " + precio + "}";
    }

}
