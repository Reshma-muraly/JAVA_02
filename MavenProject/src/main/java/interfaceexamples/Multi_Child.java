package interfaceexamples;

public class Multi_Child implements Multi_Example, Multi_Sub {

	public void div()
	{
		System.out.println("DIVISION");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multi_Child maths= new Multi_Child();
		maths.add();
		maths.div();
		maths.sub();
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("SUBSTRACTION");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("ADDITION");
	}

}
