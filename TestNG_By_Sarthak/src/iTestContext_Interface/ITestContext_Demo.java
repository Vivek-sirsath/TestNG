package iTestContext_Interface;

import org.testng.ITestContext;
import org.testng.annotations.Test;

/*
 * ITestContext - ITestContext is an interface
 * Purpose - It helps to share the data within test cases in the same Java file or Class file.
 */

public class ITestContext_Demo {
	@Test(priority = 1)
	public void laptopMake(ITestContext context) {
		// context is an object reference of ITestContext interface.
		System.out.println("Setting manufacturer of Laptop");
		context.setAttribute("Make", "Lenovo");
	}
	
	@Test(priority = 2)
	public void laptopOS(ITestContext context) {
		// context is an object reference of ITestContext interface.
		System.out.println("Setting operating system");
		context.setAttribute("OS", "Windows 10");
	}
	
	@Test(priority = 3, dependsOnMethods = {"laptopMake","laptopOS"})
	public void graphicsCards(ITestContext context) {
		String operatingSys =  (String) context.getAttribute("OS");  // Casting
		String laptopMaker = (String)context.getAttribute("Make");
		
		System.out.println("The manufacturer of laptop is: " + laptopMaker);
		System.out.println("The operating system of laptop is: " + operatingSys);	
		
		context.setAttribute("Graphics Card", "Intel(R) HD Graphix 620 + NVIDIA GeForce 920MX");
		
	}
	
	@Test(priority = 4, dependsOnMethods = "graphicsCards")
	public void specsLaptop(ITestContext context) {
		String graphicsCards = (String)context.getAttribute("Graphics Card");
		System.out.println("Graphics Cards Intalled: " + graphicsCards);
		
	}
	
}
