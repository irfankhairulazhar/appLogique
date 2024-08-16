package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extendreport {

    static ExtentReports extent;

    public static ExtentReports getReporterObject () {

        String path = System.getProperty("user.dir")+"\\reports\\index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("android auto result");
        reporter.config().setDocumentTitle("Test Result");

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("tester", "irfan");
        return extent;
    }
}
