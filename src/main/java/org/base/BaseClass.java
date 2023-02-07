package org.base;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public static WebDriver broswerLanuch() {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	return driver;
	

}
	
}
