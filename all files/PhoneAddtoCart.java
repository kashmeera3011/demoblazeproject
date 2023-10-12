package project;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhoneAddtoCart 
{
	public static void phoneaddtocart() throws InterruptedException 
	{
		
		//samasung galaxy s6
		
		DriverConnection.driver.findElement(By.linkText("Phones")).click();
		Thread.sleep(2000);
		
		DriverConnection.driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img")).click();
		Thread.sleep(2000);
		
		DriverConnection.driver.findElement(By.linkText("Add to cart")).click();
		Thread.sleep(2000);
		
		String mainWin = DriverConnection.driver.getWindowHandle();
		
		//DriverConnection.driver.findElement(By.linkText("Product added.")).click();
		
		Set<String> allWin = DriverConnection.driver.getWindowHandles();
		
		for(String win : allWin)
		{
			if(!win.equals(mainWin))
			{
				DriverConnection.driver.switchTo().window(win);
				
			}
		}
		
		Thread.sleep(4000);
		
		Clicktocart.clicktocart();
		
	}
}
