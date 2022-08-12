package comcast.vtiger.generalutility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementationClass implements ITestListener {
	
	public void onTestFailure(ITestResult result)
	{
		String testname=result.getMethod().getMethodName();
		System.out.println(testname="Execute and iam listening");
		EventFiringWebDriver edriver=new EventFiringWebDriver(Baseclass.sDriver);
		File srcFile=edriver.getScreenshotAs(OutputType.FILE);
		try
		{
			File destFile=new File("./SDET39/screenshot"+testname+".png");
			FileUtils.copyFile(srcFile,destFile);
		}
		catch(Throwable e)
		{
		  e.printStackTrace();
		
		}
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
}
