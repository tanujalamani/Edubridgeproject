package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

	WebDriver driver;

	// constructor which can helps to do certain operation
	// constructor is similar to method, it is called when instance of class is
	// created
	// As soon as constructor is created what ever in there in constructor start get
	// executing
	// All the driver instances will be the part of this constructor
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	By searchbox = By.xpath("//textarea[@name=\"q\"]");
	By searchButton = By.xpath("//input[@name='btnK'][1]");
	By radiff_link = By.xpath("//h3[contains(text(),'Rediff.com: News | Rediffmail | Stock Quotes | Sho')]");

	public void searchGoogle(String searchInput) throws InterruptedException {

		try {
			driver.findElement(searchbox).sendKeys(searchInput);
			Thread.sleep(1000);
			driver.findElement(searchButton).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Exception caught:" + e.getMessage());
		}

	}

	public void clickRadiffLink() {
		try {
			driver.findElement(radiff_link).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Exception caught:" + e.getMessage());
		}
	}
}
