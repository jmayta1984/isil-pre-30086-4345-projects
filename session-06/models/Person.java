package models;

public class Person {

    private String name;
    private int age;

    /*
     * Constructor
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
     * Getters
     */
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /*
     * Setters
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
     * Methods
     */

    public void eats(String fruit) {
        System.out.println(name + " está comiendo " + fruit);
    }
}
