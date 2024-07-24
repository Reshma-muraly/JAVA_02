package review;

public class CInterface implements Interface2 {
	
	public void Emp3()
	{
		String Ename="RESHMA";
		System.out.println(Ename);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CInterface obj= new CInterface();
		  obj.Emp1();
		  obj.Emp2();
		  obj.Emp3();
		
		
	}

	@Override
	public void Emp1() {
		// TODO Auto-generated method stub
		String Ename1="LIYA";
		System.out.println(Ename1);
	}

	@Override
	public void Emp2() {
		// TODO Auto-generated method stub
		String Ename3="LAKSHMI";
		System.out.println(Ename3);
	}

}
