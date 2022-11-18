package com.ifpe.sexto.selenium;


import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
	@Test
	public void site_header_is_on_home_page() {  
		WebDriver browser = new ChromeDriver();
		browser.get("http://127.0.0.1/index.html");
		//String title = browser.getTitle();
        WebElement submitButton = browser.findElement(By.cssSelector("button"));
		//assertTrue(title.equals("Formulário PW"));
	        assertTrue(submitButton.getText().equals("Enviar"));
		browser.close();       

	}
}