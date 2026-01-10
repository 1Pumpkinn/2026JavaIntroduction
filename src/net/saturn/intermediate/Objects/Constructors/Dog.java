package net.saturn.intermediate.Objects.Constructors;

public class Dog {
    // Members
    // Fields
    public String picture;  // accessible from anywhere and changeable
    protected final String name;  // accessible from sub-classes and same package : Final => it can't be changed!
    private int age;        // accessible ONLY within this class

    // Constructor --> "Method" to create a new Instance of a Dog Object
    // Default Constructor
   // public Dog() {

   // }


    public static int numberOfDogs = 0;
    // static => this variable belongs to the Dog class itself, not to (one Dog object).
    // All Dog objects share the SAME value.
    // If one Dog changes it, the value changes for all Dogs.


    public Dog(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;

        numberOfDogs++;
    }

    // Methods
    public void birthday() {
        age++;
    }

    public void bark() {
        //name = "EE";  // can't change because it's a final
        System.out.println(name + " barked.");
    }

    // Getter
    public int getAge() {
        return age;
    }

}
