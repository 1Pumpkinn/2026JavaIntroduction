package net.saturn.intermediate.Objects;

import net.saturn.intermediate.Objects.Constructors.Dog;
import net.saturn.intermediate.Objects.Practice.Constructors.Human;

public class ClassesAndObjects {
    public static void main(String[] args) {
        /* CLASSES & OBJECTS */

        System.out.println("How many dogs are there: " + Dog.numberOfDogs);

        Dog bengie = new Dog("bengie.png", "bengie", 11);
        Dog jeremy = new Dog("jeremy.png", "Jeremy", 7);

        System.out.println("How many dogs are there: " + Dog.numberOfDogs);

        System.out.println("Bengie age: " + bengie.getAge());
        System.out.println("Jeremy age: " + jeremy.getAge());

        jeremy.bark();
        bengie.birthday();

        System.out.println("Bengie age: " + bengie.getAge());
        System.out.println("Jeremy age: " + jeremy.getAge());

       // bengie.age = 100; // modify this field directly! (not usually what we want)

        System.out.println("Bengie age: " + bengie.getAge());

        System.out.println("How many dogs are there: " + Dog.numberOfDogs);

        Dog charlie = new Dog("Charlie.png", "Charlie", 13);
        System.out.println("How many dogs are there: " + Dog.numberOfDogs);


        Human Vishini = new Human("Vishini ", 15, " Unemployed ", "Male");
        System.out.println(Vishini.name + Vishini.age + Vishini.job + Vishini.gender);

        Human Bob = new Human("Bob ", 18, " Unemployed ", "Male");
        System.out.println(Bob.name + Bob.age + Bob.job + Bob.gender);


    }
}
