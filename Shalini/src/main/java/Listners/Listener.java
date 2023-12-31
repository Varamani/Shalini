package Listners;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener,ISuiteListener   
{  

public void onStart(ISuite suite) {	
		System.out.println("onStart function started "  + suite.getName());
}

public void onFinish(ISuite suite) {
		System.out.println("onFinish function started "  + suite.getName());
}

public void onTestStart(ITestResult result) {  
	System.out.println(result.getName()+" test case started");	
}  
  
public void onTestSuccess(ITestResult result) {  
System.out.println("Success of test cases and its details are : "+result.getName());  
}  
  
public void onTestFailure(ITestResult result) {  
System.out.println("Failure of test cases and its details are : "+result.getName());  
}  
  
@Override  
public void onTestSkipped(ITestResult result) {  

System.out.println("Skip of test cases and its details are : "+result.getName());  
}  
  

public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
System.out.println("Failure of test cases and its details are : "+result.getName());  
}  
  

public void onStart(ITestContext context) {  
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();   
	System.out.println("Test execution started on : "+formatter.format(date));
}  
 
public void onFinish(ITestContext context) {  
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();  
	System.out.println("Test execution ended on : "+formatter.format(date));
}  
}  