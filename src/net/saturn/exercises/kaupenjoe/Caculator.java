package net.saturn.exercises.kaupenjoe;

import java.util.Scanner;

public class Caculator {
    public static void main(String[] args) {
        // Caculator...

        System.out.println("Pick Your Operator: +, -, *, /, %");
        Scanner scanner = new Scanner(System.in);

        String operator = scanner.next();

        System.out.println("Num 1");
        int num1 = scanner.nextInt();

        System.out.println("Num 2");
        int num2 = scanner.nextInt();

        if (operator.equals("+")) {
            System.out.println(num1 + num2);

        } else if (operator.equals("-")) {
            System.out.println(num1 - num2);

        } else if(operator.equals("*")) {
            System.out.println(num1 * num2);

        } else if(operator.equals("/")) {
            System.out.println(num1 / num2);

        } else {
            operator.equals("%");
            System.out.println(num1 % num2);
            }
        }
    }
