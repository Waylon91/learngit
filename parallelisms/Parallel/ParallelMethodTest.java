package Parallel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class ParallelMethodTest {
  @BeforeMethod
  public void beforeMethod() {
	  long id = Thread.currentThread().getId();
	  System.out.println("beforeMethod threadID:" + id);
  }

  @Test
  public void parallelone() {
	  long id = Thread.currentThread().getId();
	  System.out.println("parallelone threadID:" + id);  
  }
  @Test
  public void paralleltwo() {
	  long id = Thread.currentThread().getId();
	  System.out.println("paralleltwo threadID:" + id);  
  }
  @AfterMethod
  public void afterMethod() {
	  long id = Thread.currentThread().getId();
	  System.out.println("afterMethod threadID:" + id);
  }

}
