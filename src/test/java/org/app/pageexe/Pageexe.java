package org.app.pageexe;

import org.app.base.Baseclass;
import org.app.locator.Pagelocator;
import org.openqa.selenium.JavascriptExecutor;

public class Pageexe extends Pagelocator {
	public static void firstname(String name) {
		Baseclass.inputValue(Pagelocator.getFirstName(), name);
	}
	public static void lastname(String name) {
		Baseclass.inputValue(Pagelocator.getLastName(), name);
	}
	public static void phonenumber(String num) {
		Baseclass.inputValue(Pagelocator.getphonenumber(), num);
	}
	public static void mailid(String id) {
		Baseclass.inputValue(Pagelocator.getmailid(), id);
	}
	public static void address(String ad) {
		Baseclass.inputValue(Pagelocator.getaddress(), ad);
	}
	public static void subject(String sub) throws InterruptedException {
		Thread.sleep(2000);
		Baseclass.inputValue(Pagelocator.getsubject(), sub);
		Thread.sleep(2000);
		Baseclass.inputenter(Pagelocator.getsubject());
	}
	public static void gender(){
		Baseclass.clickValue(Pagelocator.getgender());
	}
	public static void hobbies() {
		Baseclass.clickValue(Pagelocator.gethobbies1());
		Baseclass.clickValue(Pagelocator.gethobbies2());
		Baseclass.clickValue(Pagelocator.gethobbies3());
	}
	public static void month(String month,String year) {
		Baseclass.clickValue(Pagelocator.getdob());
		Baseclass.selectValue(Pagelocator.getmonth(),month);
		Baseclass.selectValue(Pagelocator.getyear(),year);
		Baseclass.clickValue(Pagelocator.getdate());
	}
	public static void state() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Baseclass.clickValue(Pagelocator.getstate1());
		Baseclass.clickValue(Pagelocator.getstate2());
	}
	public static void city() {
		Baseclass.clickValue(Pagelocator.getcity1());
		Baseclass.clickValue(Pagelocator.getcity2());
	}
	public static void picture(String pic) {
		Baseclass.inputValue(Pagelocator.getpicture(), pic);
	}
	public static void submit() {
		Baseclass.clickValue(Pagelocator.getsubmit());
	}

}
