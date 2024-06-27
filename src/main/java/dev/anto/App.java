package dev.anto;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Person person1 = new Person("Pepito", "Juarez", 1965842, 2000);
        Person person2 = new Person("Roberta", "dominguez", 864733, 2050);
        
        person1.printPerson();
        person2.printPerson();
    }
}
