package project;

import org.openqa.selenium.WebDriver;



public class MainClass
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		login.login();
		
		Clicktoslidebar.clicktoslidebar();
		
		HeaderCheck.checklogo();
		
		Categories.categories();
		
		PhoneAddtoCart.phoneaddtocart();
		
		Clicktocart.clicktocart();
		
		
		
		
	}
}
