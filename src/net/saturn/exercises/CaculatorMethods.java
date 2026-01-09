package net.saturn.exercises;

import java.util.Scanner;

public class CaculatorMethods {
    public static void main(String[] args) {

        /* EXERCISE 2a: Easy Calculator (Now with net.saturn.intermediate.Methods)
         *
         * Use the same Calculator, we've made in Exercise 1a and remake it with methods!
         * In addition, make it so that the calculator asks if you'd like to continue, you can then say "y" if you do!
         * Think how this "infinite" loop could be made! (Hint: Lesson Loops)
         *
         * Estimated Time: 30-45 minutes
         *
         */

        choosing();

    }

    public static void choosing() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("what is the first number");
        int input1 = scanner.nextInt();

        System.out.println("what is the second number");
        int input2 = scanner.nextInt();


       while (scanner.hasNextInt(input2)) {
          if (scanner.hasNextInt(input2)) {
               System.out.println("Press y to continue and n to stop the Program");
                scanner.equals("y");
            } else {
              scanner.equals("n");
               break;
            }
        }

            int operation = scanner.nextInt();
            switch (operation) {
                case 0:
                    System.out.println(input1 + input2 + " Addition");
                    break;
                case 1:
                    System.out.println(input1 - input2 + " Subtraction");
                    break;
                case 2:
                    System.out.println(input1 * input2 + " Multiplication");
                    break;
                case 3:
                    System.out.println(input1 / input2 + " Division");
                    break;
                default:
                    System.out.println("Could not understand That, Try Again.");
                    break;
            }
        }
    }










//        System.out.println("Pick Your Operator: +, -, *, /, %");
//        Scanner scanner = new Scanner(System.in);
//
//        String operator = scanner.next();
//
//        System.out.println("Num 1");
//        int num1 = scanner.nextInt();
//
//        System.out.println("Num 2");
//        int num2 = scanner.nextInt();
//
//        if (operator.equals("+")) {
//            System.out.println(num1 + num2);
//
//        } else if (operator.equals("-")) {
//            System.out.println(num1 - num2);
//
//        } else if(operator.equals("*")) {
//            System.out.println(num1 * num2);
//
//        } else if(operator.equals("/")) {
//            System.out.println(num1 / num2);
//
//        } else {
//            operator.equals("%");
//            System.out.println(num1 % num2);
//        }


