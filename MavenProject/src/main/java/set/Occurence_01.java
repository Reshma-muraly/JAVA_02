package set;

import java.util.ArrayList;
import java.util.List;

public class Occurence_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> name= new <Integer> ArrayList();
		{
			name.add(9);
			name.add(8);
			name.add(6);
			name.add(8);
		}
		int firstoccurence= name.indexOf(8);
System.out.println(firstoccurence);
int lastoccurence=name.indexOf(8);
System.out.println(lastoccurence);
	}

}
