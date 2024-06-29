package pe.isil;

public class Motocicleta extends Vehiculo {
    private boolean tieneCabina;

    public Motocicleta(String modelo, String marca, boolean tieneCabina) {
        super(modelo, marca);
        this.tieneCabina = tieneCabina;
    }

    @Override
    public void encenderMotor() {
        System.out.println("Encendiendo el motor de la motocicleta");
    }

    public boolean tieneCabina() {
        return tieneCabina;
    }

    public void setTieneCabina(boolean tieneCabina) {
        this.tieneCabina = tieneCabina;
    }

}
