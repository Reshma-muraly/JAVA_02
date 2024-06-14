package aggregation;

public class Aggregation2 {

	String Name;
	int rollnum;
	
	Aggregation details;
	
	public Aggregation2(String Name,int rollnum,Aggregation details)
	{
		
		this.Name= Name;
		this.rollnum= rollnum;
	
		this.details=details;
	}
	
	public void display()
	{
		
		System.out.println(Name +rollnum );
		System.out.print(details.Sname +details.age +details.place);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregation obj= new Aggregation("VASUKI", 05,"TEST");
		
		Aggregation2 obj1=new Aggregation2("test", 05, obj);
		
		obj1.display();
	}

}
