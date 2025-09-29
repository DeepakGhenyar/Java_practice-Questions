package queue;
import java.util.*;
public class priorityque {
	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<>();
		q.add(9);
		q.add(8);
		q.add(7);
		q.add(6);
		q.add(5);
		System.out.println(q);
		for(Integer i:q) {
			System.out.println(i);
		}
	}

	
}
