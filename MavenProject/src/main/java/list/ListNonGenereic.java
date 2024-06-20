package list;

import java.util.ArrayList;
import java.util.List;

public class ListNonGenereic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List   obj= new ArrayList();
		{
		obj.add(1);
		obj.add("HELLO");
		obj.add(1.23);
		}
		System.out.println(obj);
	}


}
