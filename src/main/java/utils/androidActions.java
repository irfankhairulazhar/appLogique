package utils;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class androidActions {
    AppiumDriver driver;

    public androidActions(AppiumDriver driver)  {
        this.driver = driver;
    }

    public void longPressAction (WebElement ele) {
        ((JavascriptExecutor)driver).executeAsyncScript("mobile: longClickGesture",
                ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),"duratiom",2000));
    }

    public void scrollToEndAction () {
        boolean canScrollMore;
        do {
            canScrollMore = (boolean) ((JavascriptExecutor) driver).executeAsyncScript("mobile scrollGesture", ImmutableMap.of(
                    "left",100, "top", 100, "width", 200, "hight", 200, "directon","down",
                    "precent", 3.0));
        } while (canScrollMore);
    }

    public void swipeAction (WebElement ele, String direction) {
        ((JavascriptExecutor)driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementID", ((RemoteWebElement)ele).getId(),
                "direction","left","percent",0.75));
    }

    public void scrollToText (String text) {
        driver.findElement(AppiumBy.androidUIAutomator("new Uiscrollable(new UiSelector()).scrollUnfoView(text(\""+text+"\"));"));

    }

    public void waitForElementAppear (WebElement ele) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.attributeContains((ele), "text", "Cart"));
    }
}
