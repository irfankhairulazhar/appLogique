package steps;

import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.searchPO;
import utils.baseTest;


import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;
import java.util.logging.Logger;


public class searchSteps extends baseTest {

    private static final Logger logger = Logger.getLogger(searchSteps.class.getName());
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(searchSteps.class);


    @Test(groups = {"main","search"},description = "search data using  send date")
    public void test01SendDate () throws IOException, URISyntaxException, InterruptedException {

    Properties prop = new Properties();
    FileInputStream file  = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//data.properties");
    prop.load(file);
    String mail = prop.getProperty("email");
    String pas = prop.getProperty("password");


    searchPO search = new searchPO(driver);
    logger.info("When on Jb login page, user login with valid credentials ");
    search.inputsUsername(mail);
    search.inputsPassword(pas);
    search.buttonLogin ();
    logger.info("And user select car menu");
    search.selectCar();
    logger.info("And user Antiam Menu");
    search.antrianMenu ();
    logger.info("And user open and select date on datePicker");
    search.selectQueueDate ();
    logger.info("And user click icon search");
    search.iconSearch ();
    logger.info("Then user will get list data based on sent date");
    String expectedDateDisplay = search.displayDataBaseonDate ();
    Assert.assertEquals(expectedDateDisplay,"Antrian 09 Agustus 2024");
    String expectedNopolBasedonDates = search.expectedNopolBasedonDate ();
    Assert.assertEquals(expectedNopolBasedonDates,"BE 2234 R");
    String expectedVehicles = search.expectedVenchicle ();
    Assert.assertEquals(expectedVehicles,"COLT DIESEL 120");
    System.out.println(expectedNopolBasedonDates + expectedVehicles);
    logger.info("And user back to dashboard page");
    search.backToDashboard();
    logger.info("And user do logout app process");
    search.logOutApp ();
    search.confirmLogout ();



//    search.withOutSpk ();
//    String expectedMenu = search.directToAddCarMenu () ;
//    Assert.assertEquals(expectedMenu, "Add Car");
//    System.out.println(expectedMenu);


    }

    @Test(groups = {"main","search"},description = "search data using polis number")
    public void test02SearchUsingPolisNumber () throws IOException, URISyntaxException, InterruptedException {

        Properties prop = new Properties();
        FileInputStream file  = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//data.properties");
        prop.load(file);
        String mail = prop.getProperty("email");
        String pas = prop.getProperty("password");

        searchPO search = new searchPO(driver);
        logger.info("When on Jb login page, user login with valid credentials ");
        search.inputsUsername(mail);
        search.inputsPassword(pas);
        search.buttonLogin ();
        logger.info("And user select car menu");
        search.selectCar();
        logger.info("And user Antiam Menu");
        search.antrianMenu ();
        logger.info("And user click search option");
        search.clickSearchOption ();
        logger.info("And user select polis number");
        search.selectPolisNumber ();
        logger.info("And user input polis number");
        search.inputPolisNumber("A 1234 BC");
        logger.info("And user click icon search");
        search.iconSearch ();
        String expectedNopol = search.displayExpectedNopol();
        Assert.assertEquals(expectedNopol,"A 1234 BC");
        String expectedCar = search.displayExpectedCar ();
        Assert.assertEquals(expectedCar, "INNOVA E");
        System.out.println(expectedNopol + expectedCar);
        logger.info("And user back to dashboard page");
        search.backToDashboard();
        logger.info("And user do logout app process");
        search.logOutApp ();
        search.confirmLogout ();


    }

    @Test(groups = {"main","search"},description = "search data using spk external option")
    public void test03SpkExternal () throws IOException, InterruptedException {

        Properties prop = new Properties();
        FileInputStream file  = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//data.properties");
        prop.load(file);
        String mail = prop.getProperty("email");
        String pas = prop.getProperty("password");

        searchPO search = new searchPO(driver);
        logger.info("When on Jb login page, user login with valid credentials ");
        search.inputsUsername(mail);
        search.inputsPassword(pas);
        search.buttonLogin ();
        logger.info("And user select car menu");
        search.selectCar();
        logger.info("And user Antiam Menu");
        search.antrianMenu ();
        logger.info("And user click search option");
        search.clickSearchOption ();
        logger.info("And user select option spk external");
        search.selectSpkExternal ();
        logger.info("Then display data list based on spk external");
        String expectedDataNopolSpkExternal = search.displayExpectedDataNopolSpkExternal ();
        Assert.assertEquals(expectedDataNopolSpkExternal, "B 1111 WA");
        String expectedDataCarSpkExternal = search.expectedDataCarSpkExternal ();
        Assert.assertEquals(expectedDataCarSpkExternal, "LIMITED");
        System.out.println(expectedDataNopolSpkExternal+expectedDataCarSpkExternal);
        logger.info("And user back to dashboard page");
        search.backToDashboard();
        logger.info("And user do logout app process");
        search.logOutApp ();
        search.confirmLogout ();

    }

    @Test(groups = {"main","search"},description = "test data using spk internal")
    public void test04spkInternal () throws IOException, InterruptedException {
        Properties prop = new Properties();
        FileInputStream file  = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//data.properties");
        prop.load(file);
        String mail = prop.getProperty("email");
        String pas = prop.getProperty("password");

        searchPO search = new searchPO(driver);
        logger.info("When on Jb login page, user login with valid credentials ");
        search.inputsUsername(mail);
        search.inputsPassword(pas);
        search.buttonLogin ();
        logger.info("And user select car menu");
        search.selectCar();
        logger.info("And user Antiam Menu");
        search.antrianMenu ();
        logger.info("And user click search option");
        search.clickSearchOption ();
        logger.info("And user select option spk internal");
        search.selectSPkInternal ();
        logger.info("Then display data based on spk internal");
        search.displayExpectedNopolOForWithoutSpkList ("CC 2534 FH");
        search.displayExpectedCarSpkIntermal ("SC1013 ANGGUNA");
        logger.info("And user back to dashboard page");
        search.backToDashboard();
        logger.info("And user do logout app process");
        search.logOutApp ();
        search.confirmLogout ();


    }

    @Test(groups = {"main","search2"},description = "search using tanpa spk option")
    public void test05tanpaSPK () throws IOException, InterruptedException {
        Properties prop = new Properties();
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "//src//test//resources//data.properties");
        prop.load(file);
        String mail = prop.getProperty("email");
        String pas = prop.getProperty("password");

        searchPO search = new searchPO(driver);
        logger.info("When on Jb login page, user login with valid credentials ");
        search.inputsUsername(mail);
        search.inputsPassword(pas);
        search.buttonLogin ();
        logger.info("And user select car menu");
        search.selectCar();
        logger.info("And user Antiam Menu");
        search.antrianMenu ();
        logger.info("And user click search option");
        search.clickSearchOption ();
        logger.info("And user select option without spk");
        search.selectWithoutSPk ();
        logger.info("user will get detail data list without spk");
        search.displayExpectedNopolOForWithoutSpkList ("A 1234 BC");
        search.displayExpectedCarWithoutSpkList ("INNOVA E");
        logger.info("And user back to dashboard page");
        search.backToDashboard();
        logger.info("And user do logout app process");
        search.logOutApp ();
        search.confirmLogout ();


    }











}
