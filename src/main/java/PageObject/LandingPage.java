
package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	
	
	By spendAndSave = By.linkText("Spend & Save");
	By productImageAspiration = By.className("card-original");
	By productImageAspirationPlus = By.className("card-plus");
	By GetAspiration = By.xpath("//button[text()='Get Aspiration']");
	 By emailTextBox = By.xpath("//input[@name='email']");
	 By closeButton = By.cssSelector("button.close");
	 By GetAspirationPlusBtn  = By.xpath("//button[text()='Get Aspiration Plus']");
	 By RadbuttonYrlyPlus = By.xpath("//div[@class='options']/div[1]");
	 By RadbuttonMonthlyPlus = By.xpath("//div[@class='options']/div[2]");
	 
	 
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getElementSpendAndSave()
	{
	
		return driver.findElement(spendAndSave);
	}
	
	public WebElement getProductImageAspiration()
	{
	
		return driver.findElement(productImageAspiration);
	}
	
	public WebElement getProductImageAspirationPlus()
	{
	
		return driver.findElement(productImageAspirationPlus);
	}
	
	public WebElement getAspirationButton()
	{
	
		return driver.findElement(GetAspiration);
	}
	
	public WebElement getEmailTextBox()
	{
	
		return driver.findElement(emailTextBox);
	}
	
	public WebElement getCloseButton()
	{
	
		return driver.findElement(closeButton);
	}
	
	public WebElement GetAspirationPlusButton()
	{
	
		return driver.findElement(GetAspirationPlusBtn);
	}
	
	 public WebElement GetRadbuttonYrlyPlus()
	{
	
		return driver.findElement(RadbuttonYrlyPlus);
	}
	 
	public WebElement GetRadbuttonMonthlyPlus()
		{
		
			return driver.findElement(RadbuttonMonthlyPlus);
		}
	
}

