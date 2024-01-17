package base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;



public class BaseTests {

    protected static WebDriver driver;
    protected HomePage homePage;



    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }




    @BeforeMethod
        public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");

    }



    @AfterTest
        public void Quit(){
        driver.quit();

    }

}
