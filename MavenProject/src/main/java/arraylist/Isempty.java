package arraylist;

import java.util.ArrayList;

public class Isempty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> add= new ArrayList<String>();
		add.add("Student1");
		add.add("Student2");
		add.add("Student3");
		
		add.add( "Student3");
		boolean a= add.isEmpty();
		System.out.println(a);
	}

}
