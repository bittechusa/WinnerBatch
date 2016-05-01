import org.openqa.selenium.firefox.FirefoxDriver;

import com.bit.support.HomePage;

public class BaseTest 
{
	FirefoxDriver dr;
	/*public BaseTest(FirefoxDriver dr)
	{
		this.dr=dr;
	}*/
	public void openBrowser()
	{
		 dr=new FirefoxDriver();
		    dr.get("http://www.bittechusa.com");
		   
	}

}
