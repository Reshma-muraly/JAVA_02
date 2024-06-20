package exceptionsamples;

public class Customexception {

	
				public void custom(int age) throws VotingException
				{
					
					if (age>=18)
					{
						System.out.println("Eligible for Voting");
					}
					else
					{
						throw new VotingException("INVALID");
					}
				}
	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
		Customexception voting= new Customexception();
		voting.custom(21);
	}

}
