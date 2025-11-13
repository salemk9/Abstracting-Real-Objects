/*
 * The Tester class tests the Gondola and Person class.
 * @author Salem Kiar
 * @collaborator CoPilot
 */
public class Tester {
    public static void main(String[] args) throws Exception {
        // Create Gondoliers
        Person mario = new Person("Mario", 32);
        Person luigi = new Person("Luigi", 25);
        
        // Create Gondola objects using both constructors
        Gondola regularGondola = new Gondola();
        Gondola customGondola = new Gondola(4, 500.0, 1250.0, 12.0, "Blue", "Fiberglass", mario);

        // Print objects using toString
        System.out.println(regularGondola);
        System.out.println();
        System.out.println(customGondola);
        System.out.println();

        // Call behavior methods
        regularGondola.rowForward();
        regularGondola.turn("right");

        customGondola.loadPeople(3);
        customGondola.stop();

        //Change gondolier using setters
        regularGondola.setGondolier(luigi);
        System.out.println("\nUpdated Gondola with new Gondolier");
        System.out.println(regularGondola);

    }
}
