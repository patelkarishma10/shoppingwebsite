package com.bae.shoppingwebsite.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingWebsiteTest1 {
	public static WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void teardonw() {
		driver.quit();
	}

	@Test
	public void methodTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		WebElement checkElement = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		checkElement.click();

		checkElement = driver.findElement(By.name("email"));
		checkElement.sendKeys("anemail@gmail.com");
		checkElement = driver.findElement(By.name("passwd"));
		checkElement.sendKeys("password");

		checkElement = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		checkElement.click();

		checkElement = driver.findElement(By.name("search_query"));
		checkElement.sendKeys("dress");
		checkElement.submit();
		checkElement = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]"));
		checkElement.click();
		checkElement = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span"));
		checkElement.click();

		WebElement newElement = (new WebDriverWait(driver, 10)).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]")));

		checkElement = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		checkElement.click();
		checkElement = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		checkElement.click();
		checkElement = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
		checkElement.click();
		checkElement = driver.findElement(By.xpath("//*[@id=\"cgv\"]"));
		checkElement.click();

		checkElement = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
		checkElement.click();
		checkElement = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a"));
		checkElement.click();
		checkElement = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
		checkElement.click();
		// assertTrue(checkElement.isDisplayed());

		Thread.sleep(5000);
	}
}
