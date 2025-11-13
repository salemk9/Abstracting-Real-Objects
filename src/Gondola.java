/**
*The Gondola class depicts a gondola boat in a canal that can be customized based on its many characteristics, including material, color, weight, personCapacity, weightCapacity, gondolier, and max speed.
*@author Salem Kiar
* @collaborator CoPilot
*/

public class Gondola {
    // instance variables
    private int personCapacity;
    private double weight; // in kg
    private double weightCapacity; // in kg
    private double maxSpeed; // in km/h
    private String color;
    private String material;
    private Person gondolier; // Secondary object
   
    // default constructor with default values
    public Gondola() {
        this.personCapacity = 5;
        this.weight = 300.0;
        this.weightCapacity = 1000.0;
        this.maxSpeed = 15.0;
        this.color = "Beige";
        this.material = "Wood";
        this.gondolier = new Person("Anonymous", 25);
    }

    // overloaded constructor that allows gondola customization
    // @ param personCapacity maximum number of passengers
	// @ param weight weight of gondola in kg
	// @ param weightCapacity maximum load in kg
	// @ param maxSpeed maximum speed in km/h
	// @ param color color of gondola
	// @ param material material of gondola
    // @ param gondolier Person object representing the gondolier, who operates the gondola
    public Gondola(int personCapacity, double weight, double weightCapacity, double maxSpeed, String color, String material, Person gondolier) {
        this.personCapacity = personCapacity;
        this.weight = weight;
        this.weightCapacity = weightCapacity;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.material = material;
        this.gondolier = gondolier;
    }

    // Getters (accessors) and Setters (mutators)
    public int getPersonCapacity() {
        return personCapacity;
    }
    public void setPersonCapacity(int personCapacity) {
        this.personCapacity = personCapacity;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeightCapacity() {
        return weightCapacity;
    }
    public void setWeightCapacity(double weightCapacity) {
        this.weightCapacity = weightCapacity;
    }
    public double getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public Person getGondolier() {
        return gondolier;
    }
    public void setGondolier(Person gondolier) {
        this.gondolier = gondolier;
    }
    /*
     * loads people onto gondola
     * @param numberOfPeople number of people to load onto gondola
     */
    public void loadPeople(int numberOfPeople) {
        if (numberOfPeople <= personCapacity) {
            System.out.println(numberOfPeople + " people loaded onto the gondola.");
        } else {
            System.out.println("Cannot load " + numberOfPeople + " people. Maximum capacity is " + personCapacity + ".");
        }
    }
    /*
     * Moves gondola forward
     */
    public void rowForward() {
        System.out.println("The gondola is moving forward through the canal");
    }
    /*
     * Turns gondola in specified direction
     */
    public void turn(String direction){
        System.out.println("The gondola is turning " + direction);
    }
    /*
     * Stops gondola
     */
    public void stop() {
        System.out.println("The gondola has stopped.");
    }
    /*
     * Returns formatted string with description of gondola
     * @return String description of gondola
     */
    public String toString() {
        return "Gondola [personCapacity=" + personCapacity + ", weight=" + weight + ", weightCapacity=" + weightCapacity
                + ", maxSpeed=" + maxSpeed + ", color=" + color + ", material=" + material + ", gondolier=" + gondolier
                + "]";
    }
}