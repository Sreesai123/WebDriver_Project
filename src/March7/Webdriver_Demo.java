package March7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver_Demo {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","E:/chromedriver.exe");
WebDriver driver = new ChromeDriver();
System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
WebDriver dr =new FirefoxDriver();
	}

}
