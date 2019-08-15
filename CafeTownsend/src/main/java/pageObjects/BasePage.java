package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefsCT.ServiceHooks;

public class BasePage {

	WebDriver driver = ServiceHooks.driver;

	public BasePage() {
		driver = ServiceHooks.driver;
	}

	public void clickOnElement(WebElement anElement) {
		anElement.click();
	}

	public void enterText(WebElement anElement, String keysToSend) {
		anElement.sendKeys(keysToSend);
	}

	public boolean waitForElement(WebElement anElement, long timeInMiliSecs) {
		while (timeInMiliSecs > 0) {
			try {
				return anElement.isDisplayed();
			} catch (Exception e) {
				mySleep(500);
				timeInMiliSecs = -500;
			}
		}
		return false;
	}

	public void mySleep(int TimeInMiliSecs) {
		try {
			Thread.sleep(TimeInMiliSecs);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
