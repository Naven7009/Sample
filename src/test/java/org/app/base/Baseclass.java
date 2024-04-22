package org.app.base;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
public static WebDriver driver = null;
	
	public static void browserlaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public static void inputValue(WebElement element, String user) {
		element.sendKeys(user);
	}
	public static void inputenter(WebElement element) {
		element.sendKeys(Keys.ENTER);
	}
	public static void clickValue(WebElement element) {
		element.click();
	}
	public static void selectValue(WebElement element, String choice) {
		Select s = new Select (element);
		s.selectByVisibleText(choice);
	}

}
