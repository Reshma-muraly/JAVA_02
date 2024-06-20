package interfaceexamples;

public class Interface_03 implements Interface_02 {

	
		public void multi()
		{
			int x=52;
			int y=23;
			int z=x*y;
			System.out.println("The answer is:" +z);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_03 obj= new Interface_03();
		obj.add();
		obj.sub();
		obj.multi();
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=25;
		int c=a*b;
		System.out.println("The answer is:" +c);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
		int e=25;
		int d=2;
		int f= e-d;
		System.out.println("The answer is:" +f);
	}

}
