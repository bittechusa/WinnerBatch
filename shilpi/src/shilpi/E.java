package shilpi;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E 
{
	FirefoxDriver dr=new FirefoxDriver();
	
 void m1() 
	{
		dr.get("https://www.facebook.com/");
		dr.findElement(By.xpath("//*[@id='u_0_1']")).sendKeys("Mohammad");
		dr.findElement(By.xpath("//*[@id='u_0_3']")).sendKeys("Hoque");
		dr.findElement(By.xpath("//*[@id='u_0_5']")).sendKeys("3474849588");
		dr.findElement(By.xpath("//*[@id='u_0_8']")).sendKeys("3474849588");
		
		
		
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
