package suiteA;

import TestBase.TestBase;
import dataprovider.TestDataProvider;
import org.testng.annotations.Test;

public class TestClassAA extends TestBase {

    @Test(dataProviderClass = TestDataProvider.class, dataProvider = "testDataProviderSuiteA", groups = {"sanity"})
    public void testAA(String arg1, String arg2) throws InterruptedException {
        log("Starting TestAA");
        log("Username--"+arg1);
        log("Password--"+arg2);
        Thread.sleep(1000);
        log("Ending TestAA");
    }
}
