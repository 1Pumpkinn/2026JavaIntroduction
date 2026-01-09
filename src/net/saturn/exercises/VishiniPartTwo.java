package net.saturn.exercises;

import java.util.Scanner;

public class VishiniPartTwo {
    public static void main(String[] args) {
        // with switch statements

        Scanner scanner = new Scanner(System.in);
        int name = scanner.nextInt();

        switch (name) {
            case 1: System.out.println("Vishini"); break;
            case 2: System.out.println("Pumpkini"); break;
            case 3: System.out.println("Magnini"); break;
            case 4: System.out.println("Pandini"); break;
            case 5: System.out.println("Crimini"); break;
        }
    }
}

