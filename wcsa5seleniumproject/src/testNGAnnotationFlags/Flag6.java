package testNGAnnotationFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test(groups="Functional TestCase")
  public void ft1() {
  Reporter.log("FTC1",true);
  }
  
  @Test(groups="SmokeTestCase")
  public void St1() {
  Reporter.log("STC1",true);
  }
  
  @Test(groups="Integration TestCase")
  public void It1() {
  Reporter.log("ITC1",true);
  }
  //___________________________________________________________________________________

  @Test(groups="Functional TestCase")
  public void ft2() {
  Reporter.log("FTC1",true);
  }
  
  @Test(groups="SmokeTestCase")
  public void St2() {
  Reporter.log("STC1",true);
  }
  
  @Test(groups="Integration TestCase")
  public void It2() {
  Reporter.log("ITC1",true);
  }
  //___________________________________________________________________________________


  @Test(groups="Functional TestCase")
  public void ft3() {
  Reporter.log("FTC1",true);
  }
  
  @Test(groups="SmokeTestCase")
  public void St3() {
  Reporter.log("STC1",true);
  }
  
  @Test(groups="Integration TestCase")
  public void It3() {
  Reporter.log("ITC1",true);
  }
  //___________________________________________________________________________________

  @Test(groups="Functional TestCase")
  public void ft4() {
  Reporter.log("FTC1",true);
  }
  
  @Test(groups="SmokeTestCase")
  public void St4() {
  Reporter.log("STC1",true);
  }
  
  @Test(groups="Integration TestCase")
  public void It4() {
  Reporter.log("ITC1",true);
  }
  //___________________________________________________________________________________

  @Test(groups="Functional TestCase")
  public void ft5() {
  Reporter.log("FTC1",true);
  }
  
  @Test(groups="SmokeTestCase")
  public void St5() {
  Reporter.log("STC1",true);
  }
  
  @Test(groups="Integration TestCase")
  public void It5() {
  Reporter.log("ITC1",true);
  }
  //___________________________________________________________________________________

  @Test(groups="Functional TestCase")
  public void ft6() {
  Reporter.log("FTC1",true);
  }
  
  @Test(groups="SmokeTestCase")
  public void St6() {
  Reporter.log("STC1",true);
  }
  
  @Test(groups="Integration TestCase")
  public void It6() {
  Reporter.log("ITC1",true);
  }
  //___________________________________________________________________________________

}
