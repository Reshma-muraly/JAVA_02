package linkedlist;

import java.util.LinkedList;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> fruits= new LinkedList();
		fruits.add("APPLE");
		fruits.add("ORANGE");
		fruits.add("GRAPE");
		fruits.add("MANGO");
		boolean a= fruits.contains("aAPPLE");
			System.out.println(a);
	}

}
