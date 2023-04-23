package objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class RadiffPage {

	WebDriver driver;

	// constructor which can helps to do certain operation
	// constructor is similar to method, it is called when instance of class is
	// created
	// As soon as constructor is created what ever in there in constructor start get
	// executing
	// All the driver instances will be the part of this constructor
	public RadiffPage(WebDriver driver) {
		this.driver = driver;
	}

	By rediffLoginLink = By.xpath("//a[text()='Sign in']");
	By username_Editbox = By.xpath("//input[@id='login1']");
	By password_Editbox = By.xpath("//input[@id='password']");
	By signin_Btn = By.xpath("//input[@name='proceed']");

	public void clickrediffLogin() {
		driver.findElement(rediffLoginLink).click();
	}

	public void enterUserName(String enterUn) {
		driver.findElement(username_Editbox).sendKeys(enterUn);
	}

	public void enterPassword(String enterPwd) {
		driver.findElement(password_Editbox).sendKeys(enterPwd);
	}

	public void enterSigninbtn() {
		driver.findElement(signin_Btn).click();

		String actualResult = driver.getTitle();
		System.out.println(actualResult);
		String expectedResult = "Rediffmail";
		Assert.assertEquals(actualResult, expectedResult);

	}
}

