package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	static WebDriver driver;		
		public  static void launch(String s) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DURKESH KUMAR\\eclipse-workspace\\Pom\\div\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(s);

}

		public static void ti() {
		String d = driver.getTitle();
		System.out.println(d);
}		
	public static void fill(WebElement w,String s) {
	w.sendKeys(s);
}
	
	public static void klik(WebElement w) {
		w.click();
}	
}
