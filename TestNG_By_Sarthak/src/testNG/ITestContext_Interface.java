package testNG;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ITestContext_Interface {

	// ITestContext is an interface
	// It use to share the test data within the same class file or same java file
	
	@Test(priority = 1)
	public void login(ITestContext context) { // passing object reference inside method body
		System.out.println("This is login method");
		context.setAttribute("Website", "Flipkart");
	}
	
	@Test(priority = 2, dependsOnMethods = "login")
	public void search(ITestContext context) {
		System.out.println("This is search method");
		String shoppingWebsite = (String)context.getAttribute("Website");
		System.out.println("The shopping website is: " + shoppingWebsite);
		context.setAttribute("Mobile", "iPhone");
	}
	
	@Test(priority = 3, dependsOnMethods = {"login","search"})
	public void addToCart(ITestContext context) {
		System.out.println("This is addToCart method");
		String shoppingWebsite = (String)context.getAttribute("Website");
		System.out.println("Purchaseing from: " + shoppingWebsite);
		String purchasedItem = (String)context.getAttribute("Mobile");
		System.out.println("Purchased Item: " + purchasedItem);
	}
}
