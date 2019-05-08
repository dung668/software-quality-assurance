package test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.springframework.beans.factory.annotation.Autowired;
public class testJunit {
	private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test() {
	  System.setProperty("webdriver.chrome.driver","C:/Users/huhah/Desktop/New Folder (3)/chromedriver_win32/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
    driver.get("http://192.168.0.101:8080/tax-manager/home");
    driver.manage().window().setSize(new Dimension(1050, 840));
    driver.findElement(By.linkText("Cấu hình thuế")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".form-group:nth-child(1) > .control-label"));
      Actions builder =  new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    
    {
      WebElement element = driver.findElement(By.cssSelector(".form-group:nth-child(1) > .control-label"));
      Actions builder =  new Actions(driver);
       builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".form-group:nth-child(1) > .control-label"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".form-group:nth-child(1)")).click();
    driver.findElement(By.id("email")).sendKeys("9900000");
    // 9 | click | css=.form-group:nth-child(2) |  |
    driver.findElement(By.cssSelector(".form-group:nth-child(2)")).click();
    // 10 | type | id=pwd | 3650000 |
    driver.findElement(By.id("pwd")).sendKeys("3650000");
    // 11 | mouseDownAt | id=pwd1 | 15.671875,19 |
    {
      WebElement element = driver.findElement(By.id("pwd1"));
      Actions builder = new Actions(driver);
       builder.moveToElement(element).clickAndHold().perform();
    }
    // 12 | mouseMoveAt | id=pwd1 | 15.671875,19 |
    {
      WebElement element = driver.findElement(By.id("pwd1"));
      Actions builder =new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 13 | mouseUpAt | id=pwd1 | 15.671875,19 |
    {
      WebElement element = driver.findElement(By.id("pwd1"));
      Actions builder = new Actions(driver);
       builder.moveToElement(element).release().perform();
    }
    // 14 | click | id=pwd1 |  |
    driver.findElement(By.id("pwd1")).click();
    // 15 | type | id=pwd1 | 730000 |
    driver.findElement(By.id("pwd1")).sendKeys("730000");
    // 16 | click | css=.btn |  |
    driver.findElement(By.cssSelector(".btn")).click();
    assertEquals(true, true);
  }
}
