package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {
    static ExtentReports extent;

    public static ExtentReports getExtent() {
        if (extent == null) {
            extent = new ExtentReports();
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter("index.html");
            sparkReporter.config().setTheme(Theme.DARK);
            sparkReporter.config().setDocumentTitle("TestNG Pilot Project");
            sparkReporter.config().setReportName("TestNG Extent Report");
            extent.attachReporter(sparkReporter);
        }
        return extent;
    }
}
