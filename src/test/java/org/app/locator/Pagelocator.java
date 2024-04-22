package org.app.locator;

import org.app.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Pagelocator extends Baseclass{
	public static WebElement getFirstName() {
		return driver.findElement(By.id("firstName"));
	}
	public static WebElement getLastName() {
		return driver.findElement(By.id("lastName"));
	}
	public static WebElement getphonenumber() {
		return driver.findElement(By.id("userNumber"));
	}
	public static WebElement getmailid() {
		return driver.findElement(By.id("userEmail"));
	}
	public static WebElement getaddress() {
		return driver.findElement(By.id("currentAddress"));
	}
	public static WebElement getsubject() {
		return driver.findElement(By.xpath("//input[@id='subjectsInput']"));
	}
	public static WebElement getgender() {
		return driver.findElement(By.xpath("//label[text()='Female']"));
	}
	public static WebElement gethobbies1() {
		return driver.findElement(By.xpath("//label[text()='Sports']"));
	}
	public static WebElement gethobbies2() {
		return driver.findElement(By.xpath("//label[text()='Reading']"));
	}
	public static WebElement gethobbies3() {
		return driver.findElement(By.xpath("//label[text()='Music']"));
	}
	public static WebElement getdob() {
		return driver.findElement(By.id("dateOfBirthInput"));
	}
	public static WebElement getmonth() {
		return driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
	}
	public static WebElement getyear() {
		return driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
	}
	public static WebElement getdate() {
		return driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--019']"));
	}
	public static WebElement getpicture() {
		return driver.findElement(By.id("uploadPicture"));
	}
	public static WebElement getstate1() {
		return driver.findElement(By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[1]"));
	}
	public static WebElement getstate2() {
		return driver.findElement(By.xpath("//div[text()='Haryana']"));
	}
	public static WebElement getcity1() {
		return driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[2]"));
	}
	public static WebElement getcity2() {
		return driver.findElement(By.xpath("//div[text()='Panipat']"));
	}
	public static WebElement getsubmit() {
		return driver.findElement(By.id("submit"));
	}
	

}
