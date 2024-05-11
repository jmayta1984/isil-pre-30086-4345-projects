class Person {
    // Fields
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Instance methods
    public void walk() {
        System.out.println(name + " is walking.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

}