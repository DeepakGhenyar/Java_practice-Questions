package set;

import java.util.*;

public class set {
    public static void main(String[] args) {
        // 1. HashSet with integers
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(30);
        hashSet.add(20);
        hashSet.add(10); // duplicate ignored
        System.out.println("HashSet: " + hashSet);

        // 2. LinkedHashSet with integers (maintains insertion order)
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(15);
        linkedHashSet.add(25);
        linkedHashSet.add(15); // duplicate ignored
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // 3. TreeSet with integers (sorted automatically)
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(40);
        treeSet.add(30);
        treeSet.add(10); // duplicate ignored
        System.out.println("TreeSet: " + treeSet);

        // 🔹 Common methods
        System.out.println("\n--- Methods on TreeSet ---");
        System.out.println("Contains 30? " + treeSet.contains(30));
        System.out.println("Size: " + treeSet.size());

        treeSet.remove(40);
        System.out.println("After removing 40: " + treeSet);

        // Iterating
        System.out.print("Iterating TreeSet: ");
        for (int num : treeSet) {
            System.out.print(num + " ");
        }

        // Clear
        treeSet.clear();
        System.out.println("\nAfter clear(): " + treeSet);
    }
}
