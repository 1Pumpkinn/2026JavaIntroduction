package exercise;

import java.util.Scanner;

public class Vishini {
    public static void main(String[] args) {

        // if int == 1 Vishini if int == 2 Pumpkini, if int == 3 Magnini etc etc

        Scanner scanner = new Scanner(System.in);
          int result = scanner.nextInt();

        if(result == 1) {
            System.out.println("Vishini");

        } else if(result == 2) {
            System.out.println("Pumpkini");
        } else if(result == 3){
            System.out.println("Magnini");
        } else {
            System.out.println("Could not understand that Integer");
        }
    }
}


