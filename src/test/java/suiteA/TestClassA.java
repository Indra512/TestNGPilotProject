package suiteA;

import TestBase.TestBase;
import dataprovider.TestDataProvider;
import org.testng.annotations.Test;

public class TestClassA extends TestBase {

    @Test(dataProviderClass = TestDataProvider.class, dataProvider = "testDataProviderSuiteA", groups = {"smoke"})
    public void testA(String arg1, String arg2) throws InterruptedException {
        log("Starting TestA");
        log("Username--"+arg1);
        if (!arg1.equals("USERNAME_DEMO"))
            fail(arg1+" is not equal to "+"USERNAME_DEMO");
        log("Password--"+arg2);
        if (!arg2.equals("PASSWORD_DEMO"))
//            fail(arg2+" is not equal to "+"PASSWORD_DEMO");
            failAndStop(arg2+" is not equal to "+"PASSWORD_DEMO");
        Thread.sleep(1000);
        log("Ending TestA");
        softAssert.assertAll();
    }
}
