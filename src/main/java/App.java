import org.apache.commons.lang3.exception.ExceptionContext;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {

	WebDriver driver;
	String BASE_URL = "https://www.instagram.com/";

	By usernameLocator = new By.ByCssSelector("input[name='username']");
	By passwordLocator = new By.ByCssSelector("input[name='password']");
	By loginButtonLocator = new By.ByCssSelector("button[type='submit']");
	By instagramLogoLocator = new By.ByClassName("s4Iyt");
	By profileNameLocator = new By.ByClassName("nZSzR");
	By postLocator = new By.ByClassName("_9AhH0");
	By likeButtonLocator = new By.ByCssSelector("span.fr66n");
	By postCountLocator = new By.ByClassName("g47SY");
	By htmlTag = By.tagName("html");

	public App() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(BASE_URL);
		driver.manage().window().maximize();

	}

	public void loginWith(String username, String password) {

		waitFor(usernameLocator);

		driver.findElement(usernameLocator).sendKeys(username);
		driver.findElement(passwordLocator).sendKeys(password);
		driver.findElement(loginButtonLocator).click();

	}

	public void profileGit(String profileName) {
		waitFor(instagramLogoLocator);

		driver.navigate().to(BASE_URL.concat(profileName));

	}

	public void ilkG�nderiyeT�kla() {

		waitFor(profileNameLocator);

		driver.findElements(postLocator).get(0).click();

	}

	public void B�t�nPostlar�Be�en() {

		int count = getPostCount();

		while (count > 0) {

			waitFor(likeButtonLocator);

			driver.findElement(likeButtonLocator).click();

			driver.findElement(htmlTag).sendKeys(Keys.ARROW_RIGHT);

			count--;

		}

	}

	private int getPostCount() {

		String count = driver.findElement(postCountLocator).getText();
		return Integer.parseInt(count);
	}

	private void waitFor(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

}
