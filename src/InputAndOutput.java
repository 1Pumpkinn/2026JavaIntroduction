import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        /* Input and Output*/

        /* Output */
        // You (usually) output Strings
        System.out.println("Hello World this is out First Output!");
        System.out.println("sout shortcut for System.out.println();");

        // Values
        int life = 42;
        System.out.println(life);

        // Value and String
        int grade = 85;
        System.out.println("You're Grade is " + grade);

        /* INPUT */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); // HAS TO BE A NUMBER
        System.out.println("You just typed out the number " + number);

        String input = scanner.next();
        System.out.println("You just typed (String): " + input);

        float floatNum = scanner.nextFloat();
        System.out.println("You just typed (Float): " + floatNum);

        double doubleNum = scanner.nextDouble();
        System.out.println("You just typed (Double): " + doubleNum);
    }
}