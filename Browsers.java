package automation;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      selectBrowser("edge");
		
		
	}
	public static void selectBrowser(String browser) throws InterruptedException {
		WebDriver driver = null;
		if (browser=="chrome")
		{
			 driver = WebDriverManager.chromedriver().create();
		}
		else if(browser=="firefox")
		{
			 driver = WebDriverManager.firefoxdriver().create();
		}
		else if (browser=="edge")
		{
			 driver = WebDriverManager.edgedriver().create();
		}
		
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.quit();
	}
	

}
