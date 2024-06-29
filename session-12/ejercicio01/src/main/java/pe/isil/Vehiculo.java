package pe.isil;

public abstract class Vehiculo {
    private String modelo;
    private String marca;

    public Vehiculo(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public abstract void encenderMotor();

    public void mostrarDatos(){
        System.out.println("Marca: " + marca );
        System.out.println("Modelo: " + modelo);
    }
}
