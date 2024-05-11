package model;

public class Cat {
    public String name;
    public String breed;
    public float weight;
    public String gender;

    public void sleep(){
        System.out.println(name + " is sleeping." );
    }

    public void walk(){
        System.out.println(name + " is walking." );
    }

    public void eat(){
        System.out.println(name + " is eating." );
    }

}
