package inheritance;



	

public class SingleInheritance1 extends SingleInheritance {
	public void  sub  ()
	{
		int a=52;
		int b=5;
		int c=a-b;
		System.out.println(c);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleInheritance1 obj= new SingleInheritance1();
		obj.sub();
		obj.display(2,5);
		
	}
	

}
