package Wrappers;

import java.awt.image.DataBuffer;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cook.DataBaseProvider;
import cook.Report;

public class GenericWrappers extends DataBaseProvider implements Wrappers  {
	public interface invokeApp {

	}

	RemoteWebDriver driver;
	int i =1;


	public void takeSnap() {
		File srcFile1 = driver.getScreenshotAs(OutputType.FILE);
		File destFile1 = new File("./snaps/snap"+i+".jpeg");

		try {
			FileUtils.copyFile(srcFile1, destFile1);
		} catch (IOException e) {

			System.err.println("There was IO Exception while taking the SnapShot");
		}
		i++;

	}

	public void closeBrowser() {
		try {
			driver.close();
			System.out.println("Browser Closed");
		} catch (Exception e) {
			System.err.println("The browser:"+driver.getCapabilities().getBrowserName()+" could not be closed.");
		}
	}

	public void closeAllBrowsers() {
		try {
			driver.quit();
			System.out.println("Browser Closed");
		} catch (Exception e) {
			System.err.println("The browser:"+driver.getCapabilities().getBrowserName()+" could not be closed.");
		}
	}

	public void invokeApp(String browser, String url) throws Exception {
		// TODO Auto-generated method stub
		if(browser == "chrome"){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();

		}
		else if(browser == "Firefox"){
			System.setProperty("webdriver.Gecko.driver", "./drivers/chromedriver.exe");
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();
		driver.get(url);

	}

	public void enterById(String idValue, String data) throws Exception {
		// TODO Auto-generated method stub

		driver.findElementById(idValue).sendKeys(data);
	}

	public void enterByName(String nameValue, String data) throws Exception {
		// TODO Auto-generated method stub

		driver.findElementByName(nameValue).sendKeys(data);

	}

	public void enterByXpath(String xpathValue, String data) throws Exception {
		// TODO Auto-generated method stub
		driver.findElementByXPath(xpathValue).sendKeys(data);
	}

	public boolean verifyTitle(String title) {
		// TODO Auto-generated method stub
		driver.getTitle();  // Check Again
		return false;
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		driver.findElementById(id).getText();
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		driver.findElementById(xpath).getText();
        
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		

	}

	public void clickById(String id) throws Exception {
		// TODO Auto-generated method stub
          WebElement String = driver.findElementById(id); //Check
	}

	public void clickByClassName(String classVal) throws Exception {
		// TODO Auto-generated method stub

        driver.findElementByClassName(classVal).click();		
	}

	public void clickByName(String name) throws Exception {
		// TODO Auto-generated method stub
        driver.findElementByName(name).click();
	}

	public void clickByLink(String name) throws Exception {
		// TODO Auto-generated method stub
       driver.findElementByLinkText(name).click();
	}

	public void clickByLinkNoSnap(String name) throws Exception {
		// TODO Auto-generated method stub
          driver.findElementByPartialLinkText(name).click(); //To Check
	}

	public void clickByXpath(String xpathVal) throws Exception {
		// TODO Auto-generated method stub
          driver.findElementByXPath(xpathVal).click();
	}

	public void clickByXpathNoSnap(String xpathVal) throws Exception {
		// TODO Auto-generated method stub
		

	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		driver.findElementById("idVal").getText();
		return null;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		driver.findElementByXPath(xpathVal).getText();
		return null;
	}

	public void selectVisibileTextById(String id, String value) throws Exception {
		// TODO Auto-generated method stub
		
		                 
	}

	public void selectIndexById(String id, int value) throws Exception {
		// TODO Auto-generated method stub
       
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub

	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub

	}

	public void acceptAlert() {
		// TODO Auto-generated method stub

	}

	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

}
