package practice;

import org.testng.annotations.Test;

public class sampleTest {
	@Test(groups = {"smoke","regression"})
	public void sampleOne() {
		System.out.println("--testScript1--");
	}
	@Test(groups = "regression")
	public void sampleTwo() {
		System.out.println("--testScript2--");
	}
	@Test(groups = "regression")
	public void sampleThree() {
		System.out.println("--testScript3--");
	}
}
