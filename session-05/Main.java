public class Main {
    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person1 = new Person("John", 30);
        Person person2 = new Person("Jane", 25);

        // Call the walk method on the person1 object
        person1.walk();

        // Call the sleep method on the person2 object
        person2.sleep();

        // Update the static field institution in the Student class
        Student.institution = "Instituto ISIL";

        // Call the static method changeInstitution on the Student class
        Student.changeInstitution("ISIL+");

        // Create an instance of the Student class
        Student student1 = new Student("Alice", 20, "Computer Science");
        Student student2 = new Student("Bob", 22, "Mathematics");

        // Call the show method on the student1 object
        student1.show();

        // Call the study method on the student2 object
        student2.show();

    
    }
}
