package pageObject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.androidActions;

public class addDataWithoutSpkPO extends androidActions {

    AndroidDriver driver;
    androidActions functions;

    public addDataWithoutSpkPO (AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/btn_add_car_jba")
    private WebElement buttonTanpaSpk;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/et_seller")
    private WebElement inputSeller;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='id.logique.jbabastkjba.dev:id/text1' and @text='A AMRI BURHANUDDIN']")
    private WebElement selectOther;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/nopol_car")
    private WebElement inputNopol;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/chassis_no_car")
    private WebElement inputRangkaNumber;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/mesin_no_car")
    private WebElement inputMachineNumber;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/et_maker")
    private WebElement sectionMerk;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='id.logique.jbabastkjba.dev:id/text1' and @text='TOYOTA']")
    private WebElement selectBrandetails;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/et_model")
    private WebElement sectionModelDoc;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='id.logique.jbabastkjba.dev:id/text1' and @text='YARIS J']")
    private WebElement carTypeDetail;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/et_model_fisik")
    private WebElement modelSection;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/year_car")
    private WebElement inputYear;

    @AndroidFindBy(id = "android:id/text1")
    private WebElement sectionPool;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/text1' and @text='Seller_Pool']")
    private WebElement selectSellerPool;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/save_car")
    private WebElement buttoSave;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/seller_name")
    private WebElement displayExpectedSeller;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/nopol_seller")
    private WebElement displayExpectedNopol;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/norangka_seller")
    private WebElement displayExpectedRangkaNum;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/nomesin_seller")
    private WebElement displayExpectedMachineNum;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/merk_seller")
    private WebElement displayExpectedMerk;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/model_seller")
    private WebElement displayExpectedModel;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/tahun_seller")
    private WebElement displayExpectedYear;

    @AndroidFindBy(id = "id.logique.jbabastkjba.dev:id/pool_seller")
    private WebElement displayExpectedPool;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    private WebElement backButton;

    public void buttonTanpaSpk () throws InterruptedException {
        Thread.sleep(2000);
        buttonTanpaSpk.click();
    }

    public void inputSeller () throws InterruptedException {
        Thread.sleep(5000);
        inputSeller.click();
        Thread.sleep(5000);
        selectOther.click();


    }

    public void inputNopol (String npl) throws InterruptedException {
        Thread.sleep(1000);
        inputNopol.sendKeys(npl);

    }

    public void inputRangkaNumber (String  rangNum) throws InterruptedException {
        Thread.sleep(1000);
        inputRangkaNumber.sendKeys(rangNum);
    }

    public void inputMachineNumber (String machNum) throws InterruptedException {
        Thread.sleep(1000);
        inputMachineNumber.sendKeys(machNum);
    }

    public void inputMerk () throws InterruptedException {
        Thread.sleep(1000);
        sectionMerk.click();
        Thread.sleep(1000);
        selectBrandetails.click();

    }

    public void inputModelDoc (String models) throws InterruptedException {
        Thread.sleep(1000);
        sectionModelDoc.click();
        Thread.sleep(3000);
        String uiAutomatorQuery = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + models + "\"))";
        WebElement element = driver.findElement(new AppiumBy.ByAndroidUIAutomator(uiAutomatorQuery));
//        functions.scrollToEndAction();
        Thread.sleep(2000);
        element.click();

    }

    public void modelFisik (String psyc) throws InterruptedException {
        Thread.sleep(1000);
        modelSection.click();
        Thread.sleep(3000);
        String uiAutomatorQuery = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" +psyc + "\"))";
        WebElement element = driver.findElement(new AppiumBy.ByAndroidUIAutomator(uiAutomatorQuery));
        Thread.sleep(2000);
        carTypeDetail.click();

    }

    public void inputYear (String years) throws InterruptedException {
        Thread.sleep(1000);
        inputYear.sendKeys(years);
        driver.hideKeyboard();

    }

    public void selectSellerPool () throws InterruptedException {
        Thread.sleep(1000);
        sectionPool.click();
        Thread.sleep(1000);
        selectSellerPool.click();


    }

    public void buttonSave () throws InterruptedException {
        Thread.sleep(1000);
        buttoSave.click();
    }

    public String displayExpectedSeller () throws InterruptedException {
        Thread.sleep(10000);
        return displayExpectedSeller.getText ();
    }

    public String displayExpectedNopol () throws InterruptedException {
        Thread.sleep(1000);
        return displayExpectedNopol.getText ();

    }

    public String displayExpectedRangkaNum () throws InterruptedException {
        Thread.sleep(1000);
        return displayExpectedRangkaNum.getText ();
    }

    public String displayExpectedMachineNum () throws InterruptedException {
        Thread.sleep(1000);
        return displayExpectedMachineNum.getText ();
    }

    public String  displayExpectedMerk () throws InterruptedException {
        Thread.sleep(1000);
        return displayExpectedMerk.getText();
    }

    public String displayExpectedModel () throws InterruptedException {
        Thread.sleep(1000);
        return displayExpectedModel.getText();
    }

    public String displayExpectedYear () throws InterruptedException {
        Thread.sleep(1000);
        return displayExpectedYear.getText();
    }

    public String displayExpectedPool () throws InterruptedException {
        Thread.sleep(1000);
        return displayExpectedPool.getText();
    }

    public void backButton () throws InterruptedException {
        Thread.sleep(2000);
        backButton.click();
        Thread.sleep(2000);
        backButton.click();
    }


}
