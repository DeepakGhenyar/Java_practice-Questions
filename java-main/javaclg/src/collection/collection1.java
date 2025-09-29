package collection;

import java.util.ArrayList;
import java.util.Collections;

public class collection1 {
    public static void main(String[] args) {

        // ✅ Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // add() → add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Initial ArrayList: " + fruits);

        // get(index) → access element
        System.out.println("Element at index 2: " + fruits.get(2));

        // set(index, element) → update element
        fruits.set(1, "Kiwi");
        System.out.println("After set(1, Kiwi): " + fruits);

        // remove(index) → remove by index
        fruits.remove(0);
        System.out.println("After remove(0): " + fruits);

        // contains(element) → check existence
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // size() → number of elements
        System.out.println("Size of ArrayList: " + fruits.size());

        // isEmpty() → check if empty
        System.out.println("Is ArrayList empty? " + fruits.isEmpty());

        // Iterating through ArrayList
        System.out.println("\nIterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // sort() → sorting the list
        Collections.sort(fruits);
        System.out.println("\nSorted ArrayList: " + fruits);

        // clear() → remove all elements
        fruits.clear();
        System.out.println("After clear(): " + fruits);
    }
}
