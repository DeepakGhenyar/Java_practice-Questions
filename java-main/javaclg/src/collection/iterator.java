package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iterator {
    public static void main(String[] args) {
        // ✅ Create ArrayList of names
        ArrayList<String> names = new ArrayList<>();
        names.add("Deepanshu");
        names.add("Aman");
        names.add("Riya");
        names.add("Karan");
        names.add("Sneha");

        System.out.println("ArrayList of Names: " + names);

        // 1️⃣ Iteration using for-each loop
        System.out.println("\nUsing for-each loop:");
        for (String name : names) {
            System.out.println(name);
        }

        // 2️⃣ Iteration using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()) {
            String name = itr.next();
            System.out.println(name);
        }

        // 3️⃣ Iteration using ListIterator (forward)
        System.out.println("\nUsing ListIterator (Forward):");
        ListIterator<String> listItr = names.listIterator();
        while (listItr.hasNext()) {
            String name = listItr.next();
            System.out.println(name);
        }

        // 4️⃣ Iteration using ListIterator (backward)
        System.out.println("\nUsing ListIterator (Backward):");
        while (listItr.hasPrevious()) {
            String name = listItr.previous();
            System.out.println(name);
        }
    }
}
