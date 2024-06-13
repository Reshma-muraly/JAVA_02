package superfiles;

public class Super1 extends Super {

	String colours="YELLOW";
	
	public void display()
	{
		
		System.out.println(colours);
		System.out.println(super.colours);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super1 obj= new Super1();
		obj.display();
	}

}
