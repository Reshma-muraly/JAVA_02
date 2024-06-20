package inheritance;

public class Multi3 extends Multi2 {
 public void Multiple()
 {
	 int x=5;
	 int y=6;
	 int z=x*y;
	 System.out.println("The sum is:" +x);
 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multi3 obj= new Multi3();
		obj.add();
		obj.sub();
		obj.Multiple();
	}

}
