package com.skillup.automation;

import com.skillup.automation.pages.LoginPage;
import com.skillup.automation.pages.OnboardingPage;
import com.skillup.automation.pages.SignUpPage;
import com.skillup.automation.pages.WallPage;
import com.skillup.automation.pagesByFactory.SignUpPageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static com.skillup.automation.Configuration.Wait.FIVE_SECONDS;

public class TestRunner {
    protected WebDriver driver = null;
    protected SignUpPage signUpPage;
    protected LoginPage loginPage;
    protected WallPage wallPage;
    protected OnboardingPage onboardingPage;
    protected SignUpPageFactory signUpPageFactory;



    @BeforeSuite
    public void  beforeSuite() {
        System.out.println("Before suite");
        WebDriverManager.chromedriver().setup();
        //second metod
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait (FIVE_SECONDS, TimeUnit.SECONDS);

    }

        @BeforeClass
        public void beforeClass() {
            System.out.println("Before class");
        }

        @BeforeMethod
        public void beforeMethod() {
        //second variant
//            driver.manage().deleteAllCookies();

            System.out.println("Before method");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait (FIVE_SECONDS, TimeUnit.SECONDS);


            signUpPage = new SignUpPage(driver);
            loginPage =new LoginPage(driver);
            wallPage = new WallPage (driver);
            onboardingPage = new OnboardingPage(driver);

        }


        @AfterMethod
        public void afterMethod() {
            System.out.println("After method");
            driver.quit();   //не закриває вкладку а закриває повністю браузер

        }


        @AfterClass
        public void afterClass() {
            System.out.println("After class");

        }


    @AfterSuite
    public void  afterSuite() {
        System.out.println( "After suite");

    }

    private void closeNotUsedTabs () {
        Set<String> currentTab = driver.getWindowHandles();                         //метод для закриття окремих вкладок після тесту
        List <String> allTabs = new ArrayList<String>(driver.getWindowHandles());

        for (int i=0; i < allTabs.size (); i++);{
            String tab = allTabs.get(0);
            if (!tab.equals(currentTab));{
                driver.switchTo().window(tab);
                driver.close();
            }
        }
        driver.switchTo().window(String.valueOf(currentTab));

    }
}
