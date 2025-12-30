import javax.naming.ldap.PagedResultsControl;
import java.util.Scanner;

public class BooleanAndLogic {
    public static void main(String[] args) {
        /* BOOLEANS & LOGIC */

        // Booleans are either true or false
        boolean goodVideo = true;
        boolean subscribed = false;
        System.out.println("This is a good video " + goodVideo);

        boolean isCreative = false;
        System.out.println("Player is in Creative mode " + isCreative);

        /* COMPARISON (< <= >= > == !=) */
        int points = 80;
        int pointsForPassing = 55;
        boolean hasPassedTest = points >= pointsForPassing;
        System.out.println("Has passed Test: " + hasPassedTest);

        int health = 0;
        boolean isAlive = health > 0; // Health = 1 TRUE, Health = 0 False
        System.out.println("Player is Alive: " + isAlive);

        // (VARIABLE/VALUE comparison VARIABLE/VALUE) ==> BOOLEAN
        // int + int ==> int

        // BEWARE of STRINGS
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        boolean WRONG = name == "Kaupenjoe"; // .equals for Strings
        boolean isKaupenjoe = name.equals("Kaupenjoe");

        System.out.println("Is Your Name Kaupenjoe? " + WRONG);
        System.out.println("Is Your Name Kaupenjoe? " + isKaupenjoe);

        /* LOGIC */
        // "addition" and "subtraction" for Booleans
        // (BOOLEAN logic BOOLEAN) ==> BOOLEAN

        // OR || ==> (a || b)

        // AND && ==> (a && b)

        // NOT ! ==> a ! b

        boolean passedTest1 = true;
        boolean passedTest2 = true;
        boolean hasHonors = passedTest1 && passedTest2;

        // Mining Example
        boolean hasPickaxe = true;
        int durability = 5;
        int neededDurability = 9;

        boolean canMine3x3Area = (hasPickaxe && (durability >= neededDurability)) || isCreative;

        /* DRINKING AGE EXAMPLE */
        System.out.println("What is Your Age?");
        int age = scanner.nextInt();
        System.out.println("Put in true or false are you from Europe?");
        boolean isEuropean = scanner.nextBoolean();

        int euDrinkingAge = 18;
        int usDrinkingAge = 21;

        boolean isAmerican = !isEuropean;
        boolean couldDrinkInEU = age >= euDrinkingAge;
        boolean couldDrinkInUS = age >= usDrinkingAge;

        // My brain does not handle if they are not European
        boolean canPersonDrinkAlcohol = isEuropean && (age >= euDrinkingAge) || age >=  usDrinkingAge;
        System.out.println(canPersonDrinkAlcohol);

        // Course brain added more cleaning stuff and handles if they are not European
        boolean canPersonDrinkAlcohol1 = isEuropean && couldDrinkInEU || isAmerican && couldDrinkInUS;
        System.out.println("Can you drink? " + canPersonDrinkAlcohol1);

    }
}
