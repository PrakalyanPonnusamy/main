package testNG;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority = 0) // By setting the priority we can make which part of the method will run first and which will run last
	public void Start() 
		{
			System.out.println("Start the car");
		}
	@Test(priority = 1, enabled = false)  // we can also skip a part of the method using the enabled feature
	public void First() 
		{
			System.out.println("First Gear");
		}
	@Test(priority = 2)
	public void Second() 
		{
			System.out.println("Second Gear");
		}
	@Test(priority = 3)
	public void Third() 
		{	
			System.out.println("Third Gear");
		}
	
}
