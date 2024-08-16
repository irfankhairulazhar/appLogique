package utils;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class baseTest extends appiumServer{

    public AndroidDriver driver;
    public AppiumDriverLocalService service;


    @BeforeMethod(alwaysRun = true)
    public void configureApp () throws URISyntaxException, IOException {
        //to call data.properties
        Properties prop = new Properties();
        FileInputStream file  = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//data.properties");
        prop.load(file);
        String ip = prop.getProperty("ipAdress");
        String ports = prop.getProperty("port");

        //to call apk
        String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                + File.separator + "resources" + File.separator + "app-2.7.0-jbadev.apk";

        // to turn on appium server without cmd --> current commented in case you not set appium js on line 20 under class appium server

//        service = startAppiumServer(ip,Integer.parseInt(ports));


        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Android 14"); //please edit with use your device name
        options.setApp(appUrl);
        options.setAppPackage("id.logique.jbabastkjba.dev");
        options.setAppActivity("id.logique.jbabastkjba.view.MainActivity");
        options.setNoReset(false);


//        driver = new AndroidDriver(service.getUrl(),options); // uncomment this line if line no 49 you uncomment
        URL url = new URL("http://127.0.0.1:4723"); //comment this line if line no 50 activated
        driver = new AndroidDriver(url, options); //comment this line if line no 50 activated
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown () {
        if (driver != null) {
            driver.quit();
//            service.stop(); //to turn-off appium server
        }
    }
}
