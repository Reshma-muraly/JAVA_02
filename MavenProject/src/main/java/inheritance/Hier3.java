package inheritance;

public class Hier3 extends Hier1 {
	public void sub()
	{
		
		int a=55;
		int b=20;
		int c=a-b;
		System.out.println("The sum is:" +c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hier3 obj= new Hier3();
		obj.divide();
		obj.sub();

	}

}
