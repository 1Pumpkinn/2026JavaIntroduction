package net.saturn.exercises.kaupenjoe.solutions;
import java.util.Scanner;

public class CaculatorMethods {
    public static void main(String[] args) {
        /* EXERCISE 2a: Easy Calculator (Now with net.saturn.intermediate.Methods.Methods)
         *
         * Use the same Calculator, we've made in Exercise 1a and remake it with methods!
         * In addition, make it so that the calculator asks if you'd like to continue, you can then say "y" if you do!
         * Think how this "infinite" loop could be made! (Hint: Lesson Loops)
         *
         * Estimated Time: 30-45 minutes
         */

        /* SOLUTION EXERCISE 2a */
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What is the first number?");
            int firstNumber = scanner.nextInt();
            System.out.println("What is the second number?");
            int secondNumber = scanner.nextInt();
            System.out.println("What is the operation? (+, plus | -, minus | *, multiply, | /, divide)");
            String operation = scanner.next();
            evaluateOperation(operation, firstNumber, secondNumber);
            if (wannaStop(scanner)) {
                break;
            }
        }
    }

    /* CALCULATOR METHODS */
    public static boolean wannaStop(Scanner scanner) {
        System.out.println("\nDo you want to calculate something else? y/n");
        return !scanner.next().equals("y");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if(b == 0) {
            System.out.println("Dividing by 0 does not work!");
            return 0;
        }

        return a / b;
    }

    public static void evaluateOperation(String operation, int a, int b) {
        int result;
        switch (operation) {
            case "+", "plus": result = sum(a, b); break;
            case "-", "minus": result = subtract(a, b); break;
            case "*", "multiply": result = multiply(a, b); break;
            case "/", "divide": result = divide(a, b); break;
            default: System.out.println("Not a valid operation"); result = 0;
        };
        System.out.println("Result is " + a + " " + operation + " " + b + " = " + result);
    }
}
