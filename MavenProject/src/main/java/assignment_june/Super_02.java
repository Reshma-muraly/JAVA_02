package assignment_june;



public class Super_02 extends Super_01 {

	
	public void sub()
	{
	
	int pet=super.add(222, 350);
	if (pet %10==0)
	{
		System.out.println("the total " +pet+ " " +"is divisble by 10" );
	}
	else
	{
		System.out.println("the total " +pet+ " " +"is not divisble by 10" );
	}
	}
	
public static void main(String[] args) {
	// TODO Auto-generated method stub

	Super_02 obj= new Super_02();
	obj.sub();
}
    }

