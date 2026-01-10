package net.saturn.intermediate.Objects.Practice;

import net.saturn.exercises.Learning;

public class Objects {
    public static void main(String[] args) {

        System.out.println("--- Magnet108 ---");

        Learning magnet108 = new Learning("Magnet108", "Male", 25);
        System.out.println(magnet108.name);
        System.out.println(magnet108.gender);
        System.out.println(magnet108.age);

        System.out.println("--- Vishini ---");

        Learning vishini = new Learning("Vishini", "Male", 15);
        System.out.println(vishini.name);
        System.out.println(vishini.gender);
        System.out.println(vishini.age);

        System.out.println("--- Saturn ---");

        Learning saturn = new Learning("Satun_Dev", "All", 95);
        System.out.println(saturn.name);
        System.out.println(saturn.gender);
        System.out.println(saturn.age);
    }
}