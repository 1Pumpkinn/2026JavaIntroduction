package net.saturn.intermediate;

public class TernaryOperator {
    public static void main(String[] args) {
     /* TERNARY OPERATORS */
     // A very "compact" way to do if-else

        int health = 0;
        String status = "";
        System.out.println("What is your Status? " + status);

        if(health > 0) {
            status = "Alive";
        } else {
            status = "Non-Alive";
        }
        System.out.println("What is your Status? " + status);
        status = "";

        // TERNARY OPERATOR
        // BOOLEAN ? TRUE_RETURN : FALSE_RETURN;
        status = (health > 0) ? "Alive" : "Non-Alive";
        // Never chain Ternary Operators together and instead use a if or switch statement
        System.out.println("What is your Status? " + status);

        int points = 50;
        String passing = "";

        passing = (points >= 50) ? "You have Passed the Exam" : "You have not passed the Exam";
        System.out.println(passing);










    }
}