package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class appiumServer {
    public AppiumDriverLocalService service;
    private static ThreadLocal<AndroidDriver> androidDriver = new ThreadLocal<>();
    private static ThreadLocal<AppiumDriverLocalService> appiumDriverLocalService = new ThreadLocal<AppiumDriverLocalService>();

    //global server setup
    public AppiumDriverLocalService startAppiumServer (String ip, int ports) throws IOException {
        service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Logisly 15\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .withIPAddress(ip).usingPort(ports).build();
        service.start();
        return service;
    }


    public static synchronized void setAndroidDriver(AndroidDriver driver) {
        androidDriver.set(driver);
    }

    public static synchronized AndroidDriver getAndroidDriver() {
        return androidDriver.get();
    }

    public static synchronized void setAppiumDriverLocalService(AppiumDriverLocalService service) {
        appiumDriverLocalService.set(service);
    }

    public static synchronized AppiumDriverLocalService getAppiumDriverLocalService() {
        return appiumDriverLocalService.get();
    }





    public String getScreenshotPath (String testCaseName, AppiumDriver driver) throws IOException {
        File source = driver.getScreenshotAs(OutputType.FILE);
        String destinationFile = System.getProperty("user.dir")+"//reports"+testCaseName+".png";
        File destinationPath = new File(destinationFile);
        Files.copy(source.toPath(),destinationPath.toPath());
        return destinationFile;



    }
}
