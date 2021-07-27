package pagefactory.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pagefactory.CartPopup;
import pagefactory.HomePage;
import pagefactory.NotebookPage;
import util.PropertiesReader;

public class BaseTest {
    private WebDriver driver;

    @BeforeTest
    public void setUp(){
        PropertiesReader propertiesReader = new PropertiesReader();
        System.setProperty(propertiesReader.getDriverName(), propertiesReader.getDriverLocation());
    }

    @BeforeMethod
    public void testSetUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(new PropertiesReader().getUrl());
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    public WebDriver getDriver(){
        return driver;
    }

    public CartPopup getCartPopup(){
        return new CartPopup(getDriver());
    }

    public HomePage getHomePage(){
        return new HomePage(getDriver());
    }

    public NotebookPage getNotebookPage(){
        return new NotebookPage(getDriver());
    }
}
