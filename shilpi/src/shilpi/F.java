package shilpi;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class F {
	static  FirefoxDriver dr=new FirefoxDriver();
	public static void main(String[] args) 
	{
		login();
	}  
	
	public static void login()
	{
		
	
	    dr.get("https://www.eshopper24.com/");
		dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/a")).click();
		dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/div/div[1]/a/b")).click();
		dr.findElement(By.xpath("html/body/div[4]/div[2]/div/div/aside/figure[2]/div/ul/li[1]/ul/li[1]/ul/li[1]/a/b")).click();
		dr.findElement(By.xpath("html/body/div[4]/div[2]/div/div/section/div[1]/div[2]/div[1]/figure/figcaption/input")).click();
		dr.findElement(By.xpath("//*[@id='checkout']")).click();
		dr.findElement(By.xpath("html/body/div[4]/div[2]/div/div/div[2]/div[1]/div/div[3]/input[1]")).click();
		dr.findElement(By.xpath(".//*[@id='NewAddress_FirstName']")).sendKeys("MOHAMMAD");
        dr.findElement(By.xpath("//*[@id='NewAddress_LastName']")).sendKeys("HOQUE");
        dr.findElement(By.xpath("//*[@id='NewAddress_Email']")).sendKeys("hoque877@yahoo.com");
        dr.findElement(By.xpath("//*[@id='NewAddress_Address1']")).sendKeys("2504 TRATMN AVE");
        dr.findElement(By.xpath("//*[@id='NewAddress_Address2']")).sendKeys("APT#7B");
        dr.findElement(By.xpath("//*[@id='NewAddress_ZipPostalCode']")).sendKeys("10461");
        dr.findElement(By.xpath("//*[@id='NewAddress_PhoneNumber']")).sendKeys("(347)484-9588");
        dr.findElement(By.xpath("//*[@id='NewAddress_City']")).sendKeys("Bronx");
        dr.findElement(By.xpath("//*[@id='NewAddress_StateProvinceId']")).sendKeys("NY");
        dr.findElement(By.xpath("/*[@id='NewAddress_CountryId']")).sendKeys("USA");
        dr.findElement(By.xpath("html/body/div[4]/div[2]/div/div/div/form/figure/div/div[3]/label")).click();
        dr.findElement(By.xpath("html/body/div[4]/div[2]/div/div/div/form/figure/div/div[4]/input")).click();
	}
	

}
