package steps;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.addDataWithoutSpkPO;
import pageObject.searchPO;
import utils.baseTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class addDataWithoutSpkSteps extends baseTest {


    private static final Logger logger = Logger.getLogger(addDataWithoutSpkSteps.class.getName());

    @Test(groups = {"main","add data without spk"},description = "add new data without spk")
    public void test01addWithoutSpk () throws IOException, InterruptedException {

        Properties prop = new Properties();
        FileInputStream file  = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//data.properties");
        prop.load(file);
        String mail = prop.getProperty("email");
        String pas = prop.getProperty("password");


        addDataWithoutSpkPO addData = new addDataWithoutSpkPO(driver);
        searchPO search = new searchPO(driver);
        logger.info("When on Jb login page, user login with valid credentials ");
        search.inputsUsername(mail);
        search.inputsPassword(pas);
        search.buttonLogin ();
        logger.info("And user select car menu");
        search.selectCar();
        logger.info("And user Antiam Menu");
        search.antrianMenu ();
        logger.info("And user Click button tanpa spk");
        addData.buttonTanpaSpk();
        logger.info("And user select seler option A AMRI BURHANUDDIN");
        addData.inputSeller ();
        logger.info("And user input nopol number");
        addData.inputNopol("B 86 ACI");
        logger.info("And user input rangka number");
        addData.inputRangkaNumber("7yu839");
        logger.info("And user input machine number");
        addData.inputMachineNumber ("uuio989923");
        logger.info("And user select merk Toyota");
        addData.inputMerk();
        logger.info("And user select yaris type");
        addData.inputModelDoc("YARIS J");
        logger.info("And user input select fisik yaris");
        addData.modelFisik("YARIS J");
        logger.info("And user input tahun");
        addData.inputYear ("2023");
        logger.info("And user select seller pool");
        addData.selectSellerPool();
        addData.buttonSave ();
        logger.info("Then data saved and display correctly");
        String expectedSeller = addData.displayExpectedSeller ();
        Assert.assertEquals(expectedSeller,"A AMRI BURHANUDDIN");
        String expectedNopolAfterSubmit = addData.displayExpectedNopol ();
        Assert.assertEquals(expectedNopolAfterSubmit, "B 86 ACI");
        String expectedRangkaNum = addData.displayExpectedRangkaNum ();
        Assert.assertEquals(expectedRangkaNum, "7yu839");
        String expectedMachineNum = addData.displayExpectedMachineNum ();
        Assert.assertEquals(expectedMachineNum, "uuio989923");
        String expectedMerk = addData.displayExpectedMerk ();
        Assert.assertEquals(expectedMerk, "TOYOTA");
        String expectedModel = addData.displayExpectedModel ();
        Assert.assertEquals(expectedModel, "YARIS J");
        String expectedYear = addData.displayExpectedYear ();
        Assert.assertEquals(expectedYear, "2023");
        String expectedPool = addData.displayExpectedPool ();
        Assert.assertEquals(expectedPool, "Seller_Pool");
        logger.info("user click back button to direct antrian menu");
        addData.backButton ();
        logger.info("And user click search option");
        search.clickSearchOption ();
        logger.info("And user select option without spk");
        search.selectWithoutSPk ();
        logger.info("Then display data nopol on list without spk");
        search.displayExpectedNopolOForWithoutSpkList ("B 86 ACI");
        logger.info("Then display data car on list ");
        search.displayExpectedCarWithoutSpkList ("YARIS J");
        logger.info("And user back to dashboard page");
        search.backToDashboard();
        logger.info("And user do logout app process");
        search.logOutApp ();
        search.confirmLogout ();






    }
}
