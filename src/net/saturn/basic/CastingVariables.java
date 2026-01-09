package net.saturn.basic;

public class CastingVariables {
    public static void main(String[] args) {
        /* CASTING VARIABLES */
        // Turning one Data Type into another

        int health = 10;
        float damage = 1.5f;

        //int result = health - damage // 10 - 1.5f = 8.5f
        float resultFloat = health - damage; // yes because it's a float!
        // health can easily be converted to a 10.0 but the 1.5 cannot without data lost!

        System.out.println("Result (Float): " + resultFloat); // 8.5

        int resultInt = health - (int)damage; // Explicit "Cast" damage from float to int
        System.out.println("Result (Int): " + resultInt); // 9? 8?

        resultFloat = (float)health - damage;
        System.out.println(resultFloat); // 10 --> 10.0

        resultInt = (int)((float)health - damage); // 8.5 to int --> 8
        System.out.println("Result: " + resultInt);

        //resultInt = (boolean)health; Cannot cast booleans to ints

        String points = "100";
        String pi = "3.14159265";

        int result = Integer.parseInt(points);
        System.out.println("Result: " + result);

        double resultDouble = Double.parseDouble(pi);
        System.out.println("Double Result: " + resultDouble);


        int examPoints = 50;
        float passing = 9.5f;

        float pointResult = examPoints + passing;
        System.out.println(pointResult);

        int additionalRizzPoints = 100;
        float yourRizzPoints = 73.3f;
        float additional = yourRizzPoints + additionalRizzPoints;

        System.out.println("Result: " + additional);

        int additional1 = (int)yourRizzPoints + additionalRizzPoints;
        System.out.println("Result: " + additional1);




    }
}
