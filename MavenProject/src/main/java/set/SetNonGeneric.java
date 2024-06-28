package set;

import java.util.ArrayList;
import java.util.List;

public class SetNonGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List name= new ArrayList();
		name.add("YELLOW");
		name.add("GREEN");
		System.out.println(name);
		name.set(1, "COLOUR");
		System.out.println(name);
	}

}
