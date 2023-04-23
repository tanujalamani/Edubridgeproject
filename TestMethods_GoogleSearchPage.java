package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objects.GoogleSearchPage;
import objects.RadiffPage;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_GoogleSearchPage {

	WebDriver driver;

	GoogleSearchPage objectRepo;

	// RadiffPage rediffApp;

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\selenium web driver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void searchOperation() throws InterruptedException {
		GoogleSearchPage googlePage = new GoogleSearchPage(driver);
		googlePage.searchGoogle("Radiff");
	}

	@Test(priority = 2)
	public void verifyAndAccessRadiff() {
		objectRepo = new GoogleSearchPage(driver);
		objectRepo.clickRadiffLink();
	}

	@Test(priority = 3)
	public void rediffLoginOperation() {

		RadiffPage rediffApp = new RadiffPage(driver);
		rediffApp.clickrediffLogin();
		rediffApp.enterUserName("satishgangwani19");
		rediffApp.enterPassword("Sati1234$");
		rediffApp.enterSigninbtn();
	}
		@AfterTest
		public void afterTest() {
			// driver.close();
}
	}