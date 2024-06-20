package accessspecifier;

	public class AccessSpecifier {
	
	public void display1()
	{
		System.out.println("I'm a Public AccessSpecifier");
	}

	
	private void display2()
	{
		System.out.println("I'm Private");
	}
	
	void display3()
	{
		System.out.println("I'm Default");
	}
	
	protected void display4()
	{
		System.out.println("I'm Protected");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifier obj= new AccessSpecifier();
		
		
			obj.display1();
			obj.display2();
			obj.display3();
			obj.display4();
		
	}

}
	
	class AccessSpecifier2
	{
		
		public static void main(String args[])
		{
			
			AccessSpecifier object= new AccessSpecifier();
			
			object.display3();
			object.display4();
			object.display1();
			
		
		}
		
		
		
		
	}
