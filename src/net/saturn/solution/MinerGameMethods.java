package net.saturn.solution;

import java.util.Scanner;

public class MinerGameMethods {
    public static void main(String[] args) {
        /* EXERCISE 2b: Basic Resource Miner Game (Now with methods)
         * We will refactor (rewrite) the Classic Resource Miner Game with net.saturn.intermediate.Methods. This will CLEAN IT UP significantly!
         *
         * With this, change it to so the User can input how many blocks they want to harvest before the game ends!
         *
         * Estimated Time ~60+ minutes
         *
         */

        /* SOLUTION EXERCISE 2b */
        System.out.println("Welcome to ResourceMiner!");
        Scanner scanner = new Scanner(System.in);

        // First we define variables
        int min= 1;
        int max = 3;
        int randomBlock;
        int correctMineScore = 0;
        scanner = new Scanner(System.in);
        String toolChoice;
        int toolChoiceId = 0;
        int rounds = 0;

        System.out.println("How many block do you want to mine? 1-10");
        rounds = scanner.nextInt();

        for(int i = 0; i < rounds; i++) {
            randomBlock = getRandomBlock(min, max);
            toolChoice = chooseTool(scanner);
            toolChoiceId = getIdByToolChoice(toolChoice);

            if(areToolAndBlockMatching(randomBlock, toolChoiceId)) {
                System.out.println("The Block was mined successfully!");
                correctMineScore++;
            } else {
                System.out.println("Your tool broke, but luckily you have extra!");
            }

            System.out.println("You encounter a new Block!");
        }

        System.out.println("You have mined all Blocks! You correctly mined " + correctMineScore + " out of " + rounds + ".");

    }

    /* RESOURCE MINER METHODS */
    public static int getRandomBlock(int min, int max) {
        int randomBlock;
        randomBlock = (int) (Math.random() * (max - min + 1)) + min;
        switch (randomBlock) {
            case 1: System.out.println("You find a Stone Block"); break;
            case 2: System.out.println("You find a Clay Block"); break;
            case 3: System.out.println("You find a Cobweb Block"); break;
        }
        return randomBlock;
    }

    public static String chooseTool(Scanner scanner) {
        String toolChoice;
        System.out.println("What tool do you want to use to mine the Block: Pickaxe, Shovel or Sword?");
        toolChoice = scanner.next().toLowerCase();
        return toolChoice;
    }

    public static boolean areToolAndBlockMatching(int randomBlock, int toolChoiceId) {
        return randomBlock == toolChoiceId;
    }

    public static int getIdByToolChoice(String toolChoice) {
        return switch (toolChoice) {
            case "pickaxe": yield 1;
            case "shovel": yield 2;
            case "sword": yield 3;
            default: System.out.println("ERROR: Could not find " + toolChoice + ". Program now ending!"); yield -1;
        };
    }
}