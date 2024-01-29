package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MavenTest {
	

public class PracticeTest {
	@Test(groups = {"smoke","regression"})
	public void practiceOne() {
		System.out.println("--testScript7--");
		
	}
	@Test(groups = "regression")
	public void practiceTwo() {
		System.out.println("--testScript8--");
		
	}
	@Test(groups = "regression")
	public void practiceThree() {
		System.out.println("--testScript9--");
		
		
	}
}


}
