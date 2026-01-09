package net.saturn.intermediate;

import net.saturn.Dog;
import net.saturn.practice.Human;

public class ClassesAndObjects {
    public static void main(String[] args) {
        /* CLASSES & OBJECTS */

        Dog bengie = new Dog("bengie.png", "bengie", 11);
        Dog jeremy = new Dog("jeremy.png", "Jeremy", 7);

        System.out.println("Bengie age: " + bengie.age);
        System.out.println("Jeremy age: " + jeremy.age);

        jeremy.bark();
        bengie.birthday();

        System.out.println("Bengie age: " + bengie.age);
        System.out.println("Jeremy age: " + jeremy.age);

        bengie.age = 100; // modify this field directly! (not usually what we want)

        System.out.println("Bengie age: " + bengie.age);

        Human Vishini = new Human("Vishini ", 15, " Unemployed ", "Male");
        System.out.println(Vishini.name + Vishini.age + Vishini.job + Vishini.gender);

        Human Bob = new Human("Bob ", 18, " Unemployed ", "Male");
        System.out.println(Bob.name + Bob.age + Bob.job + Bob.gender);


    }
}
