import models.Employee;

public class Exercise {
    
    public static void main(String[] args) {
        Employee employee = new Employee("Carlos", "Gerente", 1000);

        Double percentage = 0.05;

        employee.increaseSalary(percentage);
    }
}
