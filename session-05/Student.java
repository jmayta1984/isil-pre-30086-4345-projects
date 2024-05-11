public class Student {
    // Instance fields
    String name;
    int age;
    String major;

    // Class fields
    static String institution = "ISIL";

    // Constructor
    Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    // Instance methods
    public void study() {
        System.out.println(name + " is studying.");
    }

    public void show(){ 
        System.out.println("Name: " + name + "\nAge: " + age + "\nMajor: " + major + "\nInstitution: " + institution);
    }

    // Class methods
    public static void changeInstitution(String newInstitution) {
        institution = newInstitution;
    }

}
