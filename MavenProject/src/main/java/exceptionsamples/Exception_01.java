package exceptionsamples;

public class Exception_01 {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
			int a=50;
			int b=0;
			int c=a/b;
			System.out.println(c);
}
catch(ArithmeticException a)
{
	System.out.println("ERROR OCCURED " +a);
	
	}
finally
{
System.out.println("This is the finally block. It always executes.");	
}
	}

}
