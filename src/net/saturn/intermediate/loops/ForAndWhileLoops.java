package net.saturn.intermediate.loops;

public class ForAndWhileLoops {
    public static void main(String[] args) {
        /* LOOPS (FOR & WHILE */
        // Doing things multiple times
        // Doing things multiple times
        // Doing things multiple times

        // Output all numbers from 0 to 99
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);


        // Now output numbers between 1000 and 2000, only Leap Years!
        System.out.println(1000);
        System.out.println(1004);
        System.out.println(1008);



        /* FOR LOOP */
        // for(Initialization; Condition; Update) if condition is false the loop stops!

        // Example 0 to 99
        int countTo = 100;
        for (int i = 0; i < countTo; i++) {
            if(i == 89) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("--------------------------------------");

        // Example Leap Years
        for (int i = 1000; i <= 2000; i++) {
            // If the year is divisible by 4 AND (it's NOT divisible by 100 OR it IS divisible by 400)
            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {

                if(i == 1996) {
                    continue; // skips 1996
                }
                System.out.println(i);
            }
        }

        /* WHILE LOOP */
        int heath = 10;
        while(heath > 0) {
            System.out.println("Player is still alive " + heath + " HP");
            heath--;
        }

        System.out.println("---------------------------------");

        // CAUTION FOR While Loops
        // They can cause: Infinite Loops
        heath = 10;
        while(heath > 0) {
            if(heath == 6) {
                continue; // skip the rest of the loop!
            }

            if(heath == 2) {
                break; // exit and break out of the loop
            }

            System.out.println("Player is still alive " + heath + " HP");
            heath--;
        }
    }
}
