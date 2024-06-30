package excelread;

import java.io.IOException;

public class Excel_01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String A=Excel.getStringData(3, 0);
		System.out.println(A);
		String B=Excel.getIntegerData(2, 1);
		System.out.println(B);
		
	}

}
