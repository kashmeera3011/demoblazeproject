package project;

import org.openqa.selenium.By;

public class Clicktoslidebar 
{
	public static void clicktoslidebar() throws InterruptedException 
	{
		DriverConnection.driver.findElement(By.xpath("//*[@id=\"carouselExampleIndicators\"]/a[2]/span[1]")).click();
		Thread.sleep(4000);
		
		DriverConnection.driver.findElement(By.xpath("//*[@id=\"carouselExampleIndicators\"]/a[1]/span[1]")).click();
		Thread.sleep(4000);
	}
}
