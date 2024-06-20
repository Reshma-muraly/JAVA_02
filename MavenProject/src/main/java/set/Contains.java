package set;

import java.util.ArrayList;
import java.util.List;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> colours= new <String> ArrayList();
		{
			colours.add("RED");
			colours.add("BLUE");
			colours.add("YELLOW");
			boolean a= colours.contains("WHITE");
			System.out.println(a);
		}
	}

}
