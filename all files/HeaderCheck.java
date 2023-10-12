package project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderCheck 
{
	
	
	public static void checklogo() throws InterruptedException
	{
		
		
		DriverConnection.driver.findElement(By.linkText("PRODUCT STORE")).click();
		Thread.sleep(2000);
		
		DriverConnection.driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		DriverConnection.driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		
		DriverConnection.driver.findElement(By.id("recipient-email")).sendKeys("bhavu");
		Thread.sleep(2000);
		
		DriverConnection.driver.findElement(By.id("recipient-name")).sendKeys("patel");
		Thread.sleep(2000);
		
		DriverConnection.driver.findElement(By.id("message-text")).sendKeys("Hello");
		Thread.sleep(2000);
		
		DriverConnection.driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(3000);
		
		String mainWin = DriverConnection.driver.getWindowHandle();
		
		DriverConnection.driver.findElement(By.linkText("OK")).click();
		
		Set<String> allWin = DriverConnection.driver.getWindowHandles();
		
		for(String win : allWin)
		{
			if(!win.equals(mainWin))
			{
				DriverConnection.driver.switchTo().window(win);
				
			}
		}
		
		//DriverConnection.driver.findElement(By.linkText("About us")).click();
		//Thread.sleep(2000);
		
		//DriverConnection.driver.findElement(By.xpath("//*[@id=\"videoModal\"]/div/div/div[3]/button")).click();
		//Thread.sleep(3000);
		
		
		//DriverConnection.driver.findElement(By.linkText("Cart")).click();
		//Thread.sleep(2000);
		
		
	}
	
}
