package basicTestNG;

import org.testng.annotations.Test;

public class Priority {
  @Test(priority=1 ,enabled=false)// enabling wont show the tc
  public void TC0() {
	  System.out.println("TC0");
  }
@Test
  
  public void TC1()
  {
	  System.out.println("TC1");
  }
  @Test(priority=2)
  public void TC2()
  {
	  System.out.println("TC2");
  }
  @Test
  public void TC3()
  {
	  System.out.println("TC3");
  }
}
