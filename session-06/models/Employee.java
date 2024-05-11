package models;

/*
 * Crear una clase de nombre Employee que contenga el nombre, el cargo y el sueldo de un empleado. Adicionalmente, incluir un constructor con todos los atributos, los métodos getters & setters, y un método de instancia que permita incrementar el salario en base a un porcentaje ingresado como parámetro.
 */

public class Employee {
    /*
     * Fields
     */
    private String name;
    private String jobPosition;
    private double salary;

    /*
     * Constructor
     */
    public Employee(String name, String jobPosition, double salary) {
        this.name = name;
        this.jobPosition = jobPosition;
        this.salary = salary;
    }

    /*
     * Getters
     */

    public String getName() {
        return name;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public double getSalary() {
        return salary;
    }

    /*
     * Setters
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /*
     * Instance methods
     */

    public void increaseSalary(double percentage) {
        salary *=  (1 + percentage);
        System.out.println("El nuevo salario es: " + salary);
    }
}
