package ep2;

import java.util.ArrayList;

class Student {
    private String name;
    private int age;
    private ArrayList<String> cursos;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.cursos = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<String> cursos) {
        this.cursos = cursos;
    }

    public void addCourse(String curso) {
        this.cursos.add(curso);
    }
    
    public void removeCourse(String curso) {
        this.cursos.remove(curso);
    }
}