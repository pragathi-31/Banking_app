package suyashaPackage;

import org.testng.annotations.Test;

public class SuyashaTest {
	
	

	@Test(groups = {"smoke","regression"})
	public void demoOne() {
		System.out.println("--testScript3--");
	}
	@Test(groups = "regression")
	public void demoTwo() {
		System.out.println("--testScript4--");
	}
	@Test(groups = "regression")
	public void demoThree() {
		System.out.println("--testScript5--");
	}
}


