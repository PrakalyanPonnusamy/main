package testNG;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups = {"Apple"})
	public void Apple1() {
		System.out.println("Apple Testing");
	}
	@Test(groups = {"Apple"})
	public void Apple2() {
		System.out.println("Apple 1 Testing");
	}
	@Test(groups = {"Moto"})
	public void Moto0() {
		System.out.println("Moto Testing");
	}
	@Test(groups = {"Moto"})
	public void Moto1() {
		System.out.println("Moto 1 Testing");
	}
	@Test(groups = {"Vivo"})
	public void Vivo0() {
		System.out.println("Vivo Testing");
	}
	@Test(groups = {"Vivo"})
	public void Vivo1() {
		System.out.println("Vivo 1 Testing");
	}
	@Test(groups = {"Lenovo"})
	public void Lenovo0() {

		System.out.println("Lenovo Testing");
	}
	@Test(groups = {"Lenovo"})
	public void Lenovo1() {
		System.out.println("Lenovo 1 Testing");
	}
}
