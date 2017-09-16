package loginpage;

import org.testng.annotations.Test;

import com.test.wrappers.GenericWrappers;

public class TC001_Loginpage extends GenericWrappers {
	
	@Test
	public void login() throws Exception
	{
		invokeApp("chrome","http://www.jcpcreditcard.com/mSecurity/Login/login.action?clientId=jcpenney&accountType=generic&langId=en");
		getTextByName("helpText");
	}
}
