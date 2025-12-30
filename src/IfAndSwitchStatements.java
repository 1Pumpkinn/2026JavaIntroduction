import java.util.Scanner;

public class IfAndSwitchStatements {
    public static void main(String[] args) {
        /* CONTROL FLOW (IF & SWITCH */
        // "Everything is just an if statement"
        // To "Control" the flow of the program, not just line by line!

        Scanner scanner = new Scanner(System.in);
        System.out.println("How much health do you have?");
        int health = scanner.nextInt();
        boolean isAlive = health > 0;

        if (isAlive) {
            System.out.println("You are still alive!");
        } else {
            System.out.println("GAME OVER!");
        }

        System.out.println("How many points did you have in the exam?");
        int points = scanner.nextInt();

        if (points >= 100) {
            // If points are bigger or equal to 100
            System.out.println("You have Passed with Honors");
        } else if (points >= 50) {
            // if points are bigger or equal to 50
            System.out.println("You have Passed!");
        } else {
            // Lower than 50
            System.out.println("You failed!.");
        }

        /* SWITCH STATEMENTS */
        // for explicit action for cases

        System.out.println("Gimme a Number 0 and 5...");
        int studentId = scanner.nextInt();
        switch (studentId) {
            case 0:
                System.out.println("Student Saturn has Id 0");
                break;
            case 1:
                System.out.println("Student Vishini has Id 1");
                break;
            case 2:
                System.out.println("Student Panda has Id 2");
                break;
            case 3:
                System.out.println("Student Acespeke has Id 3");
                break;
            case 4:
                System.out.println("Student Magnet has Id 4");
                break;
            case 5:
                System.out.println("Student SantaEevee has Id 5");
                break;
            default: System.out.println("ERROR: Student with ID " + studentId + " Not Found!"); break;


        }
    }
}
