package review;

public class Child extends Parent {

	public void display()
	{
		super.display();
		System.out.println("This is Child Class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child object = new Child();
		object.display();
	}

}
