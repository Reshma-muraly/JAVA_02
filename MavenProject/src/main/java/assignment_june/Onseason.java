package assignment_june;

public class Onseason extends Offseason {

	public void discount(double amount) {
		{
			
			double discount= amount*.40;
			double finalprice= amount-discount;
			System.out.println("The Orginal price  is:" +amount);
			System.out.println("The discounted price for Onseason is:" +discount);
			System.out.println("The Actual price for Onseason is:" +finalprice);
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Offseason offer= new Offseason();
		Onseason  offer2= new Onseason();
		
		offer.discount(5020);
		offer2.discount(6020);
		
	}

}
