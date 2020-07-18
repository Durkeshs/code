package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class executable extends Baseclass {
	public static void main(String[] args) {
		launch("https://www.facebook.com/");
		ti();
		WebElement user = driver.findElement(By.id("email"));
		fill(user,"csdurke123@gmail.com");
		WebElement pass = driver.findElement(By.id("password"));
		fill(pass,"12345678");
		WebElement btn = driver.findElement(By.id("loginbutton"));
		klik(btn);
		


	}
}
