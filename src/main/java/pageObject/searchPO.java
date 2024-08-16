package pageObject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.androidActions;

public class searchPO extends androidActions {

    AndroidDriver driver;

    public searchPO (AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/username")
    private WebElement inputUsername;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/password")
    private WebElement inputPassword;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/login")
    private WebElement login;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/btn_car")
    private WebElement carMenu;

    @AndroidFindBy(accessibility = "Antrian Pengiriman")
    private WebElement queueMenu;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/btn_add_car_jba")
    private WebElement withoutSpk;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Add Car']")
    private WebElement addCarform;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/et_search_date")
    private WebElement openDatePicker;

    @AndroidFindBy(accessibility = "09 August 2024")
    private WebElement choose09Agust;

    @AndroidFindBy(id = "android:id/button1")
    private WebElement confirmDateSelected ;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/search_button")
    private WebElement iconSearchButton;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/date")
    private WebElement displayDataBaseonDates;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/nopol")
    private WebElement expectedNopolBasedonDate;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/type")
    private WebElement expectedVenchicle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='id.logique.jbabastkjba.dev:id/navigation_bar_item_small_label_view' and @text='Dashboard']")
    private WebElement backToDashboard;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/logout")
    private WebElement logOutApp;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
    private WebElement confirmLogout;

    @AndroidFindBy(id = "android:id/text1")
    private WebElement clickSearchOption;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/text1' and @text='Nomor Polisi']")
    private WebElement selectPolisNumber;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/et_search")
    private WebElement inputPolisNumber;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/nopol")
    private WebElement displayExpectedNopol;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/type")
    private WebElement displayExpectedCar;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/text1' and @text='SPK Eksternal']")
    private WebElement selectSokExternal;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='id.logique.jbabastkjba.dev:id/nopol' and @text='B 1111 WA']")
    private WebElement displayExpectedDataNopolSpkExternal;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='id.logique.jbabastkjba.dev:id/type' and @text='LIMITED']")
    private WebElement expectedDataCarSpkExternal;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/text1' and @text='SPK Internal']")
    private WebElement selectSPkInternal;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/text1' and @text='Tanpa SPK']")
    private WebElement selectWithoutSPk;

    public void inputsUsername (String user) throws InterruptedException {
        Thread.sleep(5000);
        inputUsername.sendKeys(user);
    }

    public void inputsPassword (String pass) throws InterruptedException {
        inputPassword.sendKeys(pass);
    }

    public void buttonLogin () throws InterruptedException {
        Thread.sleep(2000);
        login.click();
        Thread.sleep(4000);

    }

    public void selectCar () throws InterruptedException {
        Thread.sleep(3000);
        carMenu.click();

    }

    public void antrianMenu () throws InterruptedException {
        Thread.sleep(2000);
        queueMenu.click();

    }

    public void withOutSpk () throws InterruptedException {
        Thread.sleep(2000);
        withoutSpk.click();

    }

    public String directToAddCarMenu () throws InterruptedException {
        Thread.sleep(2000);
        return addCarform.getText();

    }

    public void selectQueueDate () throws InterruptedException {
        Thread.sleep(2000);
        openDatePicker.click();
        Thread.sleep(1000);
        choose09Agust.click();
        Thread.sleep(1000);
        confirmDateSelected.click();

    }

    public void iconSearch () throws InterruptedException {
        iconSearchButton.click();

    }

    public String displayDataBaseonDate () throws InterruptedException {
        Thread.sleep(1000);
        return displayDataBaseonDates.getText();
    }

    public String expectedNopolBasedonDate () throws InterruptedException {
        Thread.sleep(2000);
        return expectedNopolBasedonDate.getText();
    }

    public String expectedVenchicle () throws InterruptedException {
        Thread.sleep(2000);
        return expectedVenchicle.getText ();
    }

    public void backToDashboard () throws InterruptedException {
        Thread.sleep(2000);
        backToDashboard.click();
    }

    public void logOutApp () throws InterruptedException {
        logOutApp.click();
    }

    public void confirmLogout () throws InterruptedException {
        Thread.sleep(1000);
        confirmLogout.click();
        Thread.sleep(2000);
    }

    public void clickSearchOption () throws InterruptedException {
        Thread.sleep(2000);
        clickSearchOption.click();

    }

    public void selectPolisNumber () throws InterruptedException {
        Thread.sleep(2000);
        selectPolisNumber.click();
    }

    public void inputPolisNumber (String number) throws InterruptedException {
        inputPolisNumber.sendKeys(number);

    }

    public String displayExpectedNopol () throws InterruptedException {
        Thread.sleep(2000);
        return displayExpectedNopol.getText();
    }

    public String displayExpectedCar () throws InterruptedException {
        Thread.sleep(2000);
        return displayExpectedCar.getText();
    }

    public void selectSpkExternal () throws InterruptedException {
        Thread.sleep(1000);
        selectSokExternal.click();
    }

    public String displayExpectedDataNopolSpkExternal () throws InterruptedException {
        Thread.sleep(2000);
        return displayExpectedDataNopolSpkExternal.getText();
    }

    public String expectedDataCarSpkExternal () throws InterruptedException {
        Thread.sleep(2000);
        return expectedDataCarSpkExternal.getText();
    }

    public void selectSPkInternal () throws InterruptedException {
        Thread.sleep(2000);
        selectSPkInternal.click();
    }

    public void selectWithoutSPk () throws InterruptedException {
        Thread.sleep(2000);
        selectWithoutSPk.click();
    }

    public void displayExpectedNopolOForWithoutSpkList (String nopolNumbrs) throws InterruptedException {
        Thread.sleep(2000);
        WebElement nopolSpk = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='id.logique.jbabastkjba.dev:id/nopol' and @text='"+nopolNumbrs+"']"));
        String result = nopolSpk.getText();
        if (driver.getPageSource().contains(result)) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }
        System.out.println(result);


    }

    public void displayExpectedCarWithoutSpkList (String carWithoutSpk) throws InterruptedException {
        Thread.sleep(2000);
        WebElement carSpk = driver.findElement(By.xpath("(//android.widget.TextView[@resource-id='id.logique.jbabastkjba.dev:id/type' and @text='"+carWithoutSpk+"'])[2]"));
        String result = carSpk.getText();
        if (driver.getPageSource().contains(result)) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }
        System.out.println(result);

    }

    public void displayExpectedCarSpkIntermal (String carSpkInt) throws InterruptedException {
        Thread.sleep(2000);
        WebElement disply = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='id.logique.jbabastkjba.dev:id/type' and @text='"+carSpkInt+"']"));
        String result = disply.getText();
        if (driver.getPageSource().contains(result)) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }
        System.out.println(result);
    }




}
