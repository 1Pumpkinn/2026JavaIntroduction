package practice;

import java.util.Scanner;

public class DrinkingAge {
    public static void main(String[] args) {
        // Practicing if statements


        int euDrinkingAge = 18;
        int usaDrinkingAge = 21;

        System.out.println("What is you're age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println("True or False Are you European?");
        boolean isEuropean = scanner.nextBoolean();

        boolean isAmerican = !isEuropean;

        if(age >= euDrinkingAge && isEuropean) {
            System.out.println("Legal age to drink in Europe");
        } else if(age >= usaDrinkingAge && isAmerican) {
            System.out.println("Legal age to drink in America");
        } else {
            System.out.println("You cannot drink");
        }




    }
}
