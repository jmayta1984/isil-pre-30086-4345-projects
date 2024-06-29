package pe.isil;

public class Carro extends Vehiculo {
    private int numeroPuertas;

    public Carro(String marca, String modelo, int numeroPuertas){
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas; 
    }

    @Override
    public void encenderMotor(){
        System.out.println("Encendiendo el motor del carro");
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
}
