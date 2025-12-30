package exercise;

public class Exercise1Info {
    public static void main(String[] args) {

        /* EXERCISE 1a: Easy Calculator
         *
         * Create a Calculator that runs once.
         * You should read the operation first, then read the first and second number.
         *
         * Depending on the operation chosen, you then have to return a different result.
         * You can do this with if statements or a switch statement.
         *
         * REMEMBER: that when reading in a String, you want to use scanner.next()
         * And when comparing strings you wanna use:
         * String s = "something";
         * s.equals("something"); and not ==
         *
         * After the result has been output the program ends!
         * Estimated Time: 30-45 minutes
         *
         */

        /* EXERCISE 1b: Basic Resource Miner Game
         * Create a Basic "Resource Miner" Game. This is of course open to interpretation.
         *
         * The Basic idea is as follows: Via a random number generated, the "player" has one of (at least) three "blocks"
         * in front of them. Let's call them Clay, Stone, Cobweb as examples. The player must then decide which tool to use
         * Sword, Shovel, Pickaxe. Is the correct tool chosen then the player moves onto the next randomly selected block.
         * They should mine three blocks and then the game outputs the score on how many they mined correctly!
         *
         * When the player types in their tool, make sure to do a small amount of error correction. Make sure that both
         * lower and uppercase for the tool names are basically ignored! (Lesson: String Methods)
         *
         * For ease of use this, generates a number between 1 and 3, feel free to use it:
         * int min = 1;
         * int max = 3;
             * int randomBlock = (int) (Math.random() * (max - min + 1)) + min;
         *
         * Estimated Time ~60+ minutes
         *
         */
    }
}
