
/*
 * The person class gives the name and age of the gondolier, the individual who operates the gondola.
 * @author Salem Kiar
 * @collaborator CoPilot
 */
public class Person {
    // instance variables
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter (accessor) and Setter (mutator) for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter (accessor) and Setter (mutator) for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // Returns a string description of the gondolier
    // @return name and age of gondolier
    public String toString() {
        return name + " (Age: " + age + ")";
    }
}