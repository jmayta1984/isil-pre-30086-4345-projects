package ep2;

class Main {
    public static void main(String[] args) {
        Student student = new Student("Carlos Fuentes", 20);
        student.addCourse("Base de datos");
        student.addCourse("Desarrollo de aplicaciones");

        System.out.println(student.getCursos());
    }
}