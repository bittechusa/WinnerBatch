import org.junit.After;
import org.junit.Before;
import com.bit.support.browserInitializing;


public class BaseTest 
{

	browserInitializing a=new browserInitializing();
	
	@Before
	public void start()
	{
		a.opeBroser();
	}
	

	@After
	public void end()
	{
		a.closeBroser();
	}
	
	
}
