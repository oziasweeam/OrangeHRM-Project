package dashboard.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	public DashboardPage(WebDriver driver) { // Class 12 Day Time is 2:48H
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@name='txtUsername']")
	private static WebElement username;

	@FindBy(how = How.XPATH, using = "//*[@id='txtPassword']")
	private static WebElement password;

	@FindBy(how = How.XPATH, using = "//*[@value='LOGIN']")
	private static WebElement loginBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='welcome']")
	private static WebElement welcomeWord;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Logout')]")
	private static WebElement logoutBtn;

	public void enterUsernameAndPassword() { // Class 12 Day Time is 3:04H

		username.sendKeys("Admin");
		password.sendKeys("admin123");
	}

	public void clickOnLoginButton() {
		loginBtn.click();
	}

	public void verifyWelcomeWord() { // Class 12 Day Time is 3:18H
		String expected = "Welcome";
		String actual = welcomeWord.getText().trim();
		Assert.assertTrue("Word does not match", actual.contains(expected));

	}

	public void verifyUserName() { // Class 12 Day Time is 3:37H
		String expected = "Welcome Test";
		String actual = welcomeWord.getText().trim();
		Assert.assertTrue("Word does not match", actual.contains(expected));

	}

	public void logOut() {  // Class 12 Day Time is 3:43H
		welcomeWord.click();
		logoutBtn.click();

	}

}
