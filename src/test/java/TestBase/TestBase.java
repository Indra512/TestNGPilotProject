package TestBase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import reports.ExtentReportManager;

public class TestBase {

    private ExtentReports extentReports;
    private ExtentTest test;
    public SoftAssert softAssert;

    @BeforeMethod(alwaysRun = true)
    public void init(ITestResult result) {
        extentReports = ExtentReportManager.getExtent();
        test = extentReports.createTest(result.getMethod().getMethodName().toUpperCase());
        result.setAttribute("Status", test);
        softAssert = new SoftAssert();
    }

    @AfterMethod(alwaysRun = true)
    public void quit() {
        extentReports.flush();
    }

    public void log(String msg) {
        System.out.println(msg);
        test.info(msg);
    }

    public void pass(String msg) {
        System.out.println(msg);
        test.pass(msg);
    }

    public void fail(String msg) {
        System.out.println(msg);
        test.fail(msg);
        softAssert.fail(msg);
    }

    public void skip(String msg) {
        System.out.println(msg);
        test.skip(msg);
    }

    public void failAndStop(String msg) {
        System.out.println(msg);
        test.fail(msg);
        softAssert.assertAll();
    }
}
