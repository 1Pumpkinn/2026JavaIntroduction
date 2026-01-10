package net.saturn.intermediate.Collections;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        /* COLLECTIONS */
        // For when an Array is just not enough!

        // Reminder net.saturn.intermediate.Arrays.Arrays... But what if we want to EXPAND?
        String[] questions = new String[4];
        questions[0] = "What does WWW stand for?";
        questions[1] = "What is the World's largest Ocean?";
        questions[2] = "Which Year did East and West Germany Unify?";
        questions[3] = "What is the tallest mountain on Earth?";

        String[] answers = new String[4];
        answers[0] = "World Wide Web";
        answers[1] = "Pacific Ocean";
        answers[2] = "1990";
        answers[3] = "Mt. Everest";

        /* LIST */
        // The MUCH BETTER Array
        List<String> moreQuestions = new ArrayList<>(); // Diamond Operator for "Generic Types"
        moreQuestions.add("What website hosts the most videos in the world?");
        moreQuestions.add("What is the Capital of Germany");
        System.out.println(moreQuestions.get(0));



       // List<Integer> numbers = new ArrayList<>();
       // List<Boolean> trustValues;

        // Another type of For Loop (ForEach Loop)
        // For each String question inside of moreQuestions
        for(String question : moreQuestions) {
            System.out.println(question);
        }

        /* SET */
        // Where each element only appears once!
        Set<String> countriesToVisit = new HashSet<>();
        countriesToVisit.add("France");
        countriesToVisit.add("Canada");
        countriesToVisit.add("Spain");
        countriesToVisit.add("France"); // Skips

        System.out.println(countriesToVisit);

        /* MAP */
        // To Map one Thing to Another (Key-Value Pair)
        Map<String, Integer> countryToPopulationMap = new HashMap<>();
        countryToPopulationMap.put("USA", 331000000);
        countryToPopulationMap.put("United Kingdom", 67330000);
        countryToPopulationMap.put("Austria", 8950000);

        System.out.println(countryToPopulationMap.get("USA"));
        System.out.println(countryToPopulationMap.get("GERMANY")); // prints out null because it does not exist
        System.out.println(countryToPopulationMap);

        /* STACK & QUEUE */
        // Stacks => LIFO (Last in, First Out)
        // Queue => FIFO (First In, First Out)
        Stack<String> cards = new Stack<>();
        cards.add("King of Spades");
        cards.add("Queen of Diamonds");
        cards.add("Three of Clubs");

        // Pop will get (AND REMOVE) the "top" element of the stack (Taking the card off the top of the deck)
        System.out.println(cards.pop());
        // Peek will LOOK at the top element "get it", but will not remove it (Look at card put it back again)
        System.out.println(cards.peek());

        Queue<String> registerQueue = new ArrayDeque<>();

        registerQueue.add("___Pumpkinn");
        registerQueue.add("Saturn_Dev");
        registerQueue.add("Vishini");
        registerQueue.add("Magnet108");
        registerQueue.add("LuaBee");
        registerQueue.add("SantaEevee");
        registerQueue.add("___Paanda");
        registerQueue.add("TheCaketeen");
        registerQueue.add("3Drop");
        registerQueue.add("ShadowSpray");
        registerQueue.add("Lazem");
        registerQueue.add("Zookie");
        registerQueue.add("Crimson");
        registerQueue.add("Acespeke");
        registerQueue.add("Big Daddy Stoneiest");
        registerQueue.add("[BANNED] Lashable");

        // Poll will get (AND REMOVE) the "front" element (in the case the first person at the register!)
        System.out.println(registerQueue.poll());
        // Peek once again will get, but not remove the person at the front!
        System.out.println(registerQueue.peek());
    }
}
