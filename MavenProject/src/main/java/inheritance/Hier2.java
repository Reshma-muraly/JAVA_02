package inheritance;

public class Hier2 extends Hier1{

	public void multi()
	{
		int a=5;
		int b=5;
		int c=a*b;
		System.out.println("The sum is:" +c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hier2 obj= new Hier2();
		obj.divide();
		obj.multi();
	}
}
