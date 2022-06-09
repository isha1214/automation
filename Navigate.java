package automation;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver= WebDriverManager.chromedriver().create();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(1000);
	}

}
