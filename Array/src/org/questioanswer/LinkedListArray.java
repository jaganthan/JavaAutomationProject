package org.questioanswer;
import java.util.LinkedList;
import java.util.List;

public class LinkedListArray {

	public static void main(String[] args) {
		
		List<Integer> j = new LinkedList<Integer>();
		
		j.add(100);
		j.add(200);
		j.add(300);
		j.add(400);
		j.add(500);
		j.add(600);
		j.add(700);
		
		int size = j.size();
		System.out.println(size);
	}	
}
