public class MethodsExample {
    public static void main(String[] args) {
        Student student = new Student(10, "Juan");
        printStudentName(student);
    }

    public String addNumbers(int a, int b) {
        return "" + (a + b);
    }

    public static void printStudentName(Student student) {
        System.out.println(student.name);
    }
}
