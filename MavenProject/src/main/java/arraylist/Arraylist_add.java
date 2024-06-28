package arraylist;

import java.util.ArrayList;

public class Arraylist_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList <String> add= new ArrayList<String>();
				add.add("Student1");
				add.add("Student2");
				add.add("Student3");
				System.out.println(add);
				add.add(2, "Student3");
				System.out.println(add);
	}

}
