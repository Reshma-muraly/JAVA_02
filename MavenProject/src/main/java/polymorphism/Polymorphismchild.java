package polymorphism;

public class Polymorphismchild extends Polymorphism {
	
	public void display()
	{
		System.out.println("WELCOME");
		super.display("HELLO");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphismchild obj= new Polymorphismchild();
		obj.display();
		
	}

}
