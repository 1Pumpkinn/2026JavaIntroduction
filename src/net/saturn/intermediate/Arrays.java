package net.saturn.intermediate;

public class Arrays {
    public static void main(String[] args) {
        /* ARRAYS */
        // When you need multiple elements that are loopable
        // List of elements that you define

        String question1 = "What does WWW stand for";
        String question2 = "What is the World's largest Ocean?";
        String question3 = "Which Year did East and West Germany Unify?";

        String answer1 = "World Wide Web";
        String answer2 = "Pacific Ocean";
        String answer3 = "1990";

        // Add a fourth one...
        // Add another 15...
        // Now loop through them

        for(int i = 1; i < 4; i++ ) {
           // System.out.println(questioni); // THIS DOES NOT WORK
        }

        /* ARRAYS */
        // Think of a "list" of Elements
        // Programmers start count at 0
        String[] questions = new String[4];
        questions[0] = "What does WWW stand for?";
        questions[1] = "What is the World's largest Ocean?";
        questions[2] = "Which Year did East and West Germany Unify?";
        questions[3] = "What is the Tallest Mountain on Earth?";

        String[] answers = new String[4];
        answers[0] = "World Wide Web";
        answers[1] = "Pacific Ocean";
        answers[2] = "1990";
        answers[3] = "Mt. Everest";

        for(int i = 0; i < questions.length; i++) {
            System.out.println("Q: " + questions[i] + " | A: " + answers[i]);
        }

        int[] numbers = new int[9];
        numbers[0] = 0;
        numbers[1] = 2;
        numbers[2] = 4;
        numbers[3] = 6;
        numbers[4] = 8;
        numbers[5] = 10;
        numbers[6] = 12;
        numbers[7] = 14;
        numbers[8] = 16;
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Num: " + numbers[i]);
        }
    }
}
