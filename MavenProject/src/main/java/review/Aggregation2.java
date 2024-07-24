package review;

import aggregation.Aggregation;

public class Aggregation2 {
	String place;
	int year;
	Aggregation1 details;
	
public Aggregation2( String place, int year, Aggregation1 details)

{

	this.place=place;
	this.year=year;
	this.details=details;
	}



public void student()
{
System.out.println("Students place & year is " +place +" " +year );
System.out.print(details.name + details.age);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregation1 obj= new Aggregation1("test  ",   1991);
		Aggregation2 obj2= new Aggregation2("RESHMA", 23, obj);
		obj2.student();
		
		
		
		
	}

}
