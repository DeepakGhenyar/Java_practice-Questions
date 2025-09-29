package arraylist;

import java.util.*;

// Custom comparator for sorting strings by length
class AB implements Comparator<String> {
    @Override
    public int compare(String i, String j) {
        int lenCompare = Integer.compare(i.length(), j.length());
        if (lenCompare == 0) {
            return i.compareTo(j); // if lengths are equal, sort alphabetically
        }
        return lenCompare;
    }
}

public class SortingExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Dhruv");
        names.add("Radhika");
        names.add("Raj");
        names.add("Sanskriti");

        // Default sorting (alphabetical)
        Collections.sort(names);
        System.out.println("Alphabetical: " + names);

        // Custom sorting (by length)
        Collections.sort(names, new AB());
        System.out.println("By length: " + names);
    }
}
