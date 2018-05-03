import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class YoutubeTest {

	WebDriver driver = null;

	@Before
	public void method() {
		System.setProperty("webdriver.chrome.driver", "/Users/Tiffany/Development/Chrome_Driver/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void searchTest() {
		
		driver.get("https://www.youtube.com/");

		YoutubeHomePage page = PageFactory.initElements(driver, YoutubeHomePage.class);
		page.searchFor("Haim");

		
		WebElement checkElement = driver.findElement(By.xpath("//*[@id=\"video-title\"]"));

		assertEquals("HAIM - Want You Back (Official Video)", checkElement.getText());

	}

	@After
	public void tearDown() throws InterruptedException {

		Thread.sleep(3000);
		driver.close();

	}

}