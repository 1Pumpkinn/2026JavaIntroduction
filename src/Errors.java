import java.util.Scanner;

public class Errors {
    public static void main(String[] args) {
        /* ERRORS */
        // NEVER FEAR ERRORS --> They are normal: FEEDBACK!

        /* Compiler Errors (Syntax Errors) */
        // Errors that are shown before you Program!

        // int x = 0.0; // Error: incompatible type
        // int x = 0    // Error: variable has already been defined

        // }} too many closing curly brackets!

        // int z = 0 // Error: expected ;


        /* Runtime Errors (Exceptions) */
        // Errors that happen during the program

        // float y = 1 / 0; // Exception: Divide By Zero

        // Exception: NullPointerException
        // String text = null;
        // System.out.println("Our Text is: " + text);
        // int length = text.length();
        // System.out.println(length);

        // FAIL LOUDLY --> THIS MEANS there is something to FIX!
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter anything but a number, that's gonna throw an error");
        // int number = scanner.nextInt();
        // System.out.println("You just typed " + number);


    }
}
