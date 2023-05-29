package Testscenarios;



import org.testng.Assert;
import org.testng.annotations.Test;

import Maincode.sumadddigit;


public class Testsumadddigit {

	
  @Test
  
  public void checkzero()
  {
    sumadddigit ex = new sumadddigit();
    int sum=ex.sumMethod(0);
	Assert.assertTrue(true,"Result are not expected");
  }
  
  @Test
	
  public void checksingleDigit()
  {
    sumadddigit ex = new sumadddigit();
    int sum=ex.sumMethod(2);
	Assert.assertTrue(true,"Result are not expected");
  }
  
  @Test
  public void checkmaxnumber()
  {
    sumadddigit ex = new sumadddigit();
    int sum=ex.sumMethod(1111111111);
	Assert.assertTrue(true,"Result are not expected");
  }
	
}
