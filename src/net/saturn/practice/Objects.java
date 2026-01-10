package net.saturn.practice;

public class Objects {
    public static void main(String[] args) {

        System.out.println("--- Magnet108 ---");

        learning magnet108 = new learning("Magnet108", "Male", 25);
        System.out.println(magnet108.name);
        System.out.println(magnet108.gender);
        System.out.println(magnet108.age);

        System.out.println("--- Vishini ---");

        learning vishini = new learning("Vishini", "Male", 15);
        System.out.println(vishini.name);
        System.out.println(vishini.gender);
        System.out.println(vishini.age);

        System.out.println("--- Saturn ---");

        learning saturn = new learning("Satun_Dev", "All", 95);
        System.out.println(saturn.name);
        System.out.println(saturn.gender);
        System.out.println(saturn.age);
    }
}