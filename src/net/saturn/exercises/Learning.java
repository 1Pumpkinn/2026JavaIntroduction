package net.saturn.exercises;

import java.util.*;

public class Learning {
    public static void main(String[] args) {

        String name = "Saturn";
        int points = 20;
        int score = 20;
        float floatPoints = 20.5f;
        double doublePoints = 90.54562145D;
        boolean lightIsOn = true;

        method(50, 20);


        System.out.println(name);
        System.out.println(points);
        System.out.println(floatPoints);
        System.out.println(doublePoints);
        System.out.println("Are the lights on? " + lightIsOn);

        System.out.println(Math.max(5, 10));
        System.out.println(Math.ceil(20.5));
        System.out.println(Math.abs(38.94));
        System.out.println(Math.round(40.92));

        // Casting

        // Without data lost
        float result = points + floatPoints;
        System.out.println(result);

        // With data lost
        int result1 = points + (int) floatPoints;
        System.out.println(result1);

        System.out.println("Points are greater than 10");
        System.out.println(points > 10);

        System.out.println("Points are less than 10");
        System.out.println(points < 10);

        System.out.println("Points are equal to score");
        System.out.println(points == score);

        System.out.println("Points are not equal to score");
        System.out.println(points != score);


        if (points == score) {
            System.out.println("Points are equal to Score!");
            System.out.println("You have beaten the level!");
        } else {
            System.out.println("Points are not equal to Score!");
            System.out.println("You have failed the level Try Again!");
        }

        Scanner scanner = new Scanner(System.in);
        int userId = scanner.nextInt();
        long usersPoints = scanner.nextInt();

        switch (userId) {
            case 0:
                System.out.println("Saturn had: " + usersPoints + " points!");
                break;
            case 1:
                System.out.println("Vishini had: " + usersPoints + " points!");
                break;
            case 2:
                System.out.println("Panda had: " + usersPoints + " points!");
                break;
            case 3:
                System.out.println("Magnet108 had: " + usersPoints + " points!");
                break;
            case 4:
                System.out.println("Sushi had: " + usersPoints + " points!");
                break;
            case 5:
                System.out.println("SantaEevee had: " + usersPoints + " points!");
                break;
            case 6:
                System.out.println("Crimson had: " + usersPoints + " points!");
                break;
            case 7:
                System.out.println("Apetakeover had: " + usersPoints + " points!");
                break;
            case 8:
                System.out.println("Acespeke had: " + usersPoints + " points!");
                break;
            case 9:
                System.out.println("Lashable had: " + usersPoints + " points!");
                break;

        }


        for (points = 10; points > 9; ) {
            System.out.println(points);
            points++;
            if (points > 50) {
                break;
            }
        }

        while (score < 25) {
            System.out.println(score);
            score--;
            if (score == -6) {
                break;
            }
        }

        System.out.println("----------------------");

        String s = "Meow";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.isEmpty());
        System.out.println(s.substring(2, 4));
        System.out.println(s.concat(" MEOW MEOW MAOW MEOW KMOWRETGOJIREH"));

        int[] numbers = new int[4];
        System.out.println("-- Arrays --");
        numbers[0] = 0;
        numbers[1] = 8;
        numbers[2] = 16;
        numbers[3] = 24;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers.length);

        String hasEffect = "";
        String effect = "Strength";
        hasEffect = (effect.equals("Strength")) ? "Has Effect" : "No Effect";
        System.out.println(hasEffect);
        hasEffect = (effect.equals("meow")) ? "Has Effect" : "No Effect";
        System.out.println(hasEffect);

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Chicken");
        shoppingList.add("Ice cream");
        shoppingList.add("Chippy Chips");
        System.out.println(shoppingList);

        Map<String, Integer> statePopulation = new HashMap<>();
        statePopulation.put("NSW ", 8773000);
        statePopulation.put("Texas ", 31853800);
        statePopulation.put("New York ", 19997100);
        statePopulation.put("Florida ", 23839600);
        statePopulation.put("Pennsylvania ", 13139800);
        System.out.println(statePopulation);

        Set<Integer> mathSet = new HashSet<>();
        mathSet.add(500);
        mathSet.add(250);
        mathSet.add(197);
        mathSet.add(6767);
        mathSet.add(924);
        mathSet.add(4352);
        mathSet.add(568311);
        mathSet.add(5);
        mathSet.add(5);

        System.out.println(mathSet);

        Stack<String> LIFO = new Stack<>();
        LIFO.add("Vishini");
        LIFO.add("Pumpkin");
        LIFO.add("Saturn Dev");
        LIFO.add("Panda");
        LIFO.add("Acespeke");
        System.out.println(LIFO);
        System.out.println(LIFO.peek());
        System.out.println(LIFO.pop());

        Queue<String> firstInFirstOut = new ArrayDeque<>();
        firstInFirstOut.add("Saturn");
        firstInFirstOut.add("Vishini");
        firstInFirstOut.add("Panda");
        firstInFirstOut.add("Acepske");
        firstInFirstOut.add("Crimson");
        System.out.println(firstInFirstOut);
        System.out.println(firstInFirstOut.peek());
        System.out.println(firstInFirstOut.poll());
        System.out.println(firstInFirstOut.size());
    }

    public static int method(int num1, int num2) {

        if (num1 > num2) {
            System.out.println("Num 1 is greater than Num2");
        } else {
            System.out.println("Num 2 is less than Num 2");
        }
        return num1 + num2;
    }

    public String name;
    public String gender;
    public int age;

    public Learning(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}