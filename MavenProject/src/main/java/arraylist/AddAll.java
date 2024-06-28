package arraylist;

import java.util.ArrayList;

public class AddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> add= new ArrayList<String>();
		add.add("Student1");
		add.add("Student2");
		add.add("Student3");
		
		
		System.out.println("First List:" +add);
		
		ArrayList <String> all= new ArrayList<String>();
		all.add("Student3");
		all.add("Student4");
		all.add("Student5");
		  System.out.println("Second List: " + all);
		add.addAll(all);
		System.out.println("Merged List: " + add);
	}

}
