package dev.anto;

public class Person {
    private String name;
    private String lastname;
    private int id;
    private int years;


    public Person(String name, String lastname, int id, int years) {
        this.name = name;
        this.lastname = lastname;
        this.id = id ;
        this.years = years;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void printPerson() {
        System.out.println("name: " + this.name);
        System.out.println("lastname: " + this.lastname);
        System.out.println("id: "+ this.id);
        System.out.println("years: "+ this.years);

    }
}