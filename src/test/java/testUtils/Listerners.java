package testUtils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.appiumServer;
import utils.extendreport;

import java.io.IOException;

public class Listerners extends appiumServer implements ITestListener {

    ExtentReports extent =  extendreport.getReporterObject ();
    ExtentTest test;
    AppiumDriver driver;


    @Override
    public void onTestStart(ITestResult result) {
       test = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.fail(result.getThrowable());
        try {
            driver = (AppiumDriver) result.getTestClass().getRealClass().getField("driver")
                    .get(result.getInstance());
        } catch (Exception el) {
            el.printStackTrace();

        }
        try {
            test.addScreenCaptureFromPath(getScreenshotPath(result.getMethod().getMethodName(),driver),result.getMethod().getMethodName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.skip("Test skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Optionally implement this method if needed
    }

    @Override
    public void onStart(ITestContext context) {
        // Optionally implement this method if needed
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush(); // Finalize the report
    }
}


