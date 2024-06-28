package exceptionsamples;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=12;
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new ArithmeticException ("INVALID");
		}
		
	}

}
