package linkedlist;

import java.util.LinkedList;

public class Addall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> fruits= new LinkedList();
		fruits.add("APPLE");
		fruits.add("ORANGE");
		fruits.add("GRAPE");
		fruits.add("MANGO");
		
			System.out.println("Original fruits are"  +fruits);
			LinkedList <String> newfruits= new LinkedList();
			newfruits.add("KIWI");
			newfruits.add("PINEAPPLE");
			System.out.println("Newly Added fruits are:" +newfruits);
			fruits.addAll(newfruits);
			System.out.println("Merged fruits are:" +fruits);
			
	}

}
