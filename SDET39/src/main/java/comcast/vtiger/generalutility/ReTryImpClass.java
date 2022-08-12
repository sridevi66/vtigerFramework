package comcast.vtiger.generalutility;

import org.testng.IRetryAnalyzer;

import org.testng.ITestResult;

public class ReTryImpClass implements IRetryAnalyzer 
{

	int count=0;//initialize failedcount
	int retryLimit=2;//number of times retry
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count<retryLimit)
		{
			count++;
			return true;//true---make retry
		}
		return false;
	}

}
