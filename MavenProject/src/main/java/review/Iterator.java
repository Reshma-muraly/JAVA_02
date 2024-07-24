package review;

import java.util.ArrayList;

public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList <String> obj= new  ArrayList <String>();
		obj.add("A");
		obj.add("B");
		System.out.println(obj);
		
		java.util.Iterator<String> refVariableIterator = obj.iterator();
		while(refVariableIterator.hasNext())
		{
			System.out.println("Value located: "+ refVariableIterator.next());
		}
		
	
		
	}

}
