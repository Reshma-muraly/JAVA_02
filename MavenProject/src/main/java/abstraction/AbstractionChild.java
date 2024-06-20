package abstraction;

public class AbstractionChild extends Abstraction  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractionChild obj= new AbstractionChild();
		obj.details();
		obj.display();
		
	}

	@Override
	public void details() {
		// TODO Auto-generated method stub
		System.out.println("WELCOME");
	}

}
