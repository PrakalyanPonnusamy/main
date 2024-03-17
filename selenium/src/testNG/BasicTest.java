package testNG;

import org.testng.annotations.Test;

public class BasicTest {
	@Test 												// Test should be included in the begining of all the methods for execution 
	public void FirstTestCase() {
		System.out.println("This is the first case");
	}
	/*
	 * @Test public void SecondTestCase() {
	 * System.out.println("This is the first case"); }
	 * 
	 * @Test public void ThirdTestCase() {
	 * System.out.println("This is the first case"); }
	 * 
	 * @Test public void FourthTestCase() {
	 * System.out.println("This is the first case"); }
	 * 
	 * @Test public void FifthTestCase() {
	 * System.out.println("This is the first case"); }
	 */
}
