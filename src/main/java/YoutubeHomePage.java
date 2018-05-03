
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class YoutubeHomePage {

		@FindBy(name = "search_query")
		private WebElement searchBox;

		public void searchFor(String text) {
			searchBox.sendKeys(text);
			searchBox.submit();
		}

	}
