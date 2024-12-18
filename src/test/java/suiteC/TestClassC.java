package suiteC;

import TestBase.TestBase;
import org.testng.annotations.Test;

public class TestClassC extends TestBase {

    @Test(groups = "{sanity}")
    public void testC() throws InterruptedException {
        log("Starting TestC");
        Thread.sleep(1000);
        log("Ending TestC");
    }
}
