package listeners;

import TestBase.TestBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends TestBase implements ITestListener {

    public void onTestSuccess(ITestResult result) {
        System.out.println("**********TEST SUCCESS**********");
        ExtentTest test = (ExtentTest) result.getAttribute("Status");
        test.log(Status.INFO, "Test Case Name: "+result.getName());
        test.pass("Test Status is Success");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("**********TEST FAILURE**********");
        ExtentTest test = (ExtentTest) result.getAttribute("Status");
        test.log(Status.INFO, "Test Case Name: "+result.getThrowable().getMessage());
        test.fail("Test Status is Failure");
    }
}
