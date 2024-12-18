package suiteC;

import TestBase.TestBase;
import org.testng.annotations.Test;

public class TestClassCC extends TestBase {

    @Test(groups = {"smoke","sanity"})
    public void testCC() throws InterruptedException {
        log("Starting TestCC");
        Thread.sleep(1000);
        log("Ending TestCC");
    }
}
