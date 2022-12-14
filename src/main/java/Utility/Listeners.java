package Utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import Utility.SwagPageElement;

	public class Listeners extends SwagPageElement implements ITestListener 
	{
			
			public void onTestSuccess(ITestResult result)
			{
				System.out.println("Test is successful " +result.getName());
			}
			
			public void onTestFailure(ITestResult result)
			{
				try {
					Screenshot.takesScreenshot(driver, result.getName());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			public void OnTestSkipped(ITestResult result)
			{
				System.out.println("Test is skipped " +result.getName());
			}
			
			public void onTestStart(ITestResult result)
			{
				System.out.println("Test is started " +result.getName());
			}	
		}






