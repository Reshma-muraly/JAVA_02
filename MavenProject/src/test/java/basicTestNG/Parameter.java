package basicTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
  @Test
  @Parameters ({"P1","P2"})
  public void Testcase0(int a, String s) {
	  System.out.println("print num : "+a);
	  System.out.println("print string:" +s);
  }
}
