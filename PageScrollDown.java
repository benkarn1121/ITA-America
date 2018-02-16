package PageObject;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class PageScrollDown {

	  private static final Assert AssertJUnit = null;
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
	    System.setProperty("webdriver.chrome.driver", "C://Users/Ben Karn/Desktop/New folder/chromedriver.exe");
		  
	    driver = new ChromeDriver();
	    baseUrl = "https://kathmanduyogi.com/";
	    
	    //JavascriptExecutor jse = (JavascriptExecutor)driver;
	   // jse.executeScript("window.scrollBy(0,250)", "");
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testUntitled2() throws Exception {
	    driver.get(baseUrl + "/");
	    driver.manage().window().maximize();
	    //Thread.sleep(5000);
	    
	   // assertEquals("Kathmandu Yogi - Fair Trade Meditation Cushions | Yoga Bags | Malas", driver.getTitle());
	    //driver.findElement(By.cssSelector("span.et_bloom_close_button")).click();
	    //Assert.assertEquals("Kathmandu Yogi", driver.getTitle());
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  jse.executeScript("window.scrollBy(0,4500)", "");
	  
	  Thread.sleep(7000);
		    
	    
	   
	    //((JavascriptExecutor) driver).executeScript("scrollBy(0,700)");
	    
	    driver.findElement(By.xpath("//a[contains(.,'RETURN')]")).click();
	    
	    if(driver.getPageSource().contains("15 days"))
	    {
	    	System.out.println("Text Present");
	    }
	    else {
	    	System.out.println("Text not Present");
	    }
	    
	    	    
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	}


