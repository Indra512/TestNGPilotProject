package suiteB;

import TestBase.TestBase;
import dataprovider.TestDataProvider;
import org.testng.annotations.Test;

public class TestClassBB extends TestBase {

    @Test(dataProviderClass = TestDataProvider.class, dataProvider = "testDataProviderSuiteB", groups = {"smoke"})
    public void testBB(String arg1, String arg2) throws InterruptedException {
        log("Ending TestBB");
        log("Username--"+arg1);
        log("Password--"+arg2);
        Thread.sleep(1000);
        log("Ending TestBB");

    }
}
