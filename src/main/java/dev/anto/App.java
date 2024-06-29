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
        Person person1 = new Person("Pepito", "Rodriguez", 547596853, 10, "España", 'H');
        Person person2 = new Person("Roberta", "Josefa", 6831654, 87, "Italiana", 'M');

        
        person1.printPerson();
        person2.printPerson();
    }
}
