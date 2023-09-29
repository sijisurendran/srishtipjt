package testpackage;

import org.testng.annotations.Test;

import pagepackage.shrishtibaseclass;
import pagepackage.shrishtipage;

public class shrishtitest extends shrishtibaseclass{
	@Test
	public void pageTest()
	{
		shrishtipage ob=new shrishtipage(driver);
		ob.accountTest();
	}
}
