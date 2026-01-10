package net.saturn.intermediate.loops.Practice;

public class Loops {
    public static void main(String[] args) {
        // Practicing for and while loops



        for(int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        int health = 100;

        while(health >= 0) {
            System.out.println(health);
            health--;
        }

        health = 0;
        while(health >= 0) {
            System.out.println(health);
            health++;
            if(health == 101) {
                break;
            }
        }
    }
}
