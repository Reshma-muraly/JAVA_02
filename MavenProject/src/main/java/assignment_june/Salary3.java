package assignment_june;

public class Salary3 extends Salary2 {
	
	public void total(double basicpay, double deduction, double pf,double hra, double bonus)
	{
		
	double totalsalary= basicpay+hra-deduction-pf+bonus;
	
	System.out.println("SalarySlip");
	System.out.println("Basic pay is:" +" " +basicpay);
	
	System.out.println("HRA is:" +" " +hra);
	
	System.out.println("PF is:" +" " +pf);
	
	System.out.println("Deduction is:" +" " +deduction);
	
	System.out.println("Bonus is:" +" "+bonus);
	
	System.out.println("In Hand Salary is :" +" "+totalsalary);
	}
	public static void main(String[] args) {
		
				Salary3 total3 = new Salary3();
					total3.salary(55000d, 2300d, 50000d);
					total3.calculatehrandpf();
					total3.total(55000d, 2300d, 3300d, 14000d, 50000d);
	}

}
