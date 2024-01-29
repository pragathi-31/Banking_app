package suyashaPackage;

import org.testng.annotations.Test;

public class NivedithaTest {
	

	@Test(groups = {"smoke","regression"})
	public void NivOne() {
		System.out.println("--testScript3--");
	}
	@Test(groups = "regression")
	public void NivTwo() {
		System.out.println("--testScript4--");
	}
	@Test(groups = "regression")
	public void NivThree() {
		System.out.println("--testScript5--");
	}
	@Test(groups = "regression")
	public void NivFour() {
		System.out.println("--testScript5--");
		System.out.println("hello");
		System.out.println("yooo");
	}
}





