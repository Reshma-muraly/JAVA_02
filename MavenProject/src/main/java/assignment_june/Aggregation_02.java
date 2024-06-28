package assignment_june;

import aggregation.Aggregation;

public class Aggregation_02 {

	String Address;
	Aggregation_01 data;
	
	public  Aggregation_02(String Address ,Aggregation_01 obj)
	{
		this.Address=Address;
		this.data= obj;
		
	}
	public void Studentdetails()
	{
		System.out.println("Address is" +Address);
		System.out.println( "name is" +" " +data.Sname+ " " +"and"+  "Roll num is" +" " +data.Rnum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aggregation_01 obj= new Aggregation_01("Vasuki", 15);
		
		Aggregation_02 obj2 = new Aggregation_02("testaddress", obj);
		 obj2.Studentdetails();
	}

}
