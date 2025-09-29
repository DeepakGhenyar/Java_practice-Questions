package arraylist;

import java.util.*;

class A implements Comparator<Integer> {
    @Override
    public int compare(Integer i, Integer j) {
        if (i % 10 > j % 10) {
            return 1;
        } else if (i % 10 < j % 10) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class arraylist1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(45);
        list.add(12);
        list.add(9);
        list.add(39);

        System.out.println("Original list: " + list);

        // Normal sorting (ascending)
        Collections.sort(list);
        System.out.println("Sorted (natural order): " + list);

        // Custom sorting (based on last digit)
        Collections.sort(list, new A());
        System.out.println("Sorted (by last digit): " + list);
    }
}
