package com.bit.support;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WomenPage
{

	FirefoxDriver dr;
	public WomenPage(FirefoxDriver dr)
	{
		this.dr=dr;
	}
	public ProductDetailPage clickWomenProduct()
	{
		dr.findElement(By.xpath("html/body/div[4]/div[2]/div/div/section/section/div[1]/figure/a/img")).click();
		return new ProductDetailPage(dr);
	}


}
