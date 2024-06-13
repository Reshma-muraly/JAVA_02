package superfiles;

public class SuperMethod2 extends SuperMethod1 {

		public void sub()
		{
			int x=50;
			int y=10;
			int z=x-y;
			System.out.println("The sum is:" +z);
			super.add();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperMethod2 obj= new SuperMethod2();
		obj.sub();
	}

}
