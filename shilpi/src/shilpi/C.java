package shilpi;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C
{
	
	static FirefoxDriver dr;
	C(FirefoxDriver x)
	{
		dr=x;
		
	}
	share sr=new share(dr);

	
	 void login() throws Exception
	{
		sr.type(dr.findElement(By.xpath("//*[@id='u_0_1']")),"MOHAMMAD");
		sr.type(dr.findElement(By.xpath("//*[@id='u_0_3']")), "HOQUE");Thread.sleep(3000);
		sr.type(dr.findElement(By.xpath("//*[@id='u_0_5']")), "3474849588");
		sr.type(dr.findElement(By.xpath("//*[@id='u_0_8']")), "3474849588");
		sr.type(dr.findElement(By.xpath("//*[@id='u_0_a']")), "shahriar");
		sr.click(By.xpath("//*[@id='u_0_i']")).click();
		
		
		
		
	}
	
	
}
