package automation;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Options {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = WebDriverManager.chromedriver().create();
		
		
		driver.navigate().to("file:///C:/Users/ichandra/Desktop/dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement options = driver.findElement(By.id("cars"));
		Select dropdown = new Select(options);
		dropdown.selectByValue("audi");
		Thread.sleep(1000);
		dropdown.selectByVisibleText("Volvo");
		Thread.sleep(1000);
		dropdown.selectByIndex(2);
    	Thread.sleep(1000);

		
		WebElement first = dropdown.getFirstSelectedOption();
		System.out.println("First selected option is "+first.getText());
		
		List<WebElement> allOptions = dropdown.getAllSelectedOptions();
		System.out.println();
		System.out.println("All Selected Options are ");
		/*
		for (WebElement webElement : allOptions) {
			System.out.println(webElement.getText());	
		}
		*/
		for (Iterator iterator = allOptions.iterator(); iterator.hasNext();) {
			
			WebElement webElement = (WebElement) iterator.next();
			System.out.println(webElement.getText());
		}
		
		WebElement wrapElement = dropdown.getWrappedElement();
		System.out.println();
		System.out.println("Wrapped Elements are ");
		System.out.println(wrapElement.getText());
		
		Thread.sleep(3000);
		
	}

}
