package modelos;

public class Empleado {
    private String nombre;
    private double salario;
    private String cargo;

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double porcentaje) {
        salario *= (1 + porcentaje / 100);
        System.out.println("El nuevo salario es: " + salario);
    }

    public Empleado(String nombre, double salario, String cargo) {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
    }
    
}
