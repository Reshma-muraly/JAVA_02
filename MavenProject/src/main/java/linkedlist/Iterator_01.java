package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterator_01 {

	public static void main(String[] args) {
	
				LinkedList <String> fruits= new LinkedList();
				fruits.add("APPLE");
				fruits.add("ORANGE");
				fruits.add("GRAPE");
				fruits.add("MANGO");
			 
					Iterator <String> newfruits= fruits.iterator();
					while(newfruits.hasNext())
					{
						System.out.println("Value location is " +" "+newfruits.next());
					}
					 newfruits.remove();
					 System.out.println("Fruits after removal" +fruits);
	}

}
