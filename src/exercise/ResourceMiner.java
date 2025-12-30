package exercise;

import java.util.Scanner;

public class ResourceMiner {
    public static void main(String[] args) {

        // Resource Miner...


        int points = 0;
        int min = 1;
        int max = 3;
        String pickoutTools = "Tools: Sword, Pickaxe, Shovel";

        System.out.println(pickoutTools);
        Scanner scanner = new Scanner(System.in);
        int randomBlock = (int) (Math.random() * (max - min + 1)) + min;


        if(randomBlock == 1) {
            System.out.println("Grass Block");
            String tools = scanner.next();
            tools.equalsIgnoreCase("shovel");

        } else if(randomBlock == 1) {
            System.out.println("Did not pick the right tool");
        }
        scanner.next();



        if(randomBlock == 2) {
            System.out.println("Stone");
            String tools = scanner.next();
            tools.equalsIgnoreCase("pickaxe");

        } else if(randomBlock == 2) {
            System.out.println("Did not pick the right tool");
        }
        scanner.next();





        if(randomBlock == 3) {
            System.out.println("Cobwebs");
            String tools = scanner.next();
            tools.equalsIgnoreCase("sword");

        } else if(randomBlock == 3) {
            System.out.println("Did not pick the right tool");
        }
        scanner.next();
    }
}
