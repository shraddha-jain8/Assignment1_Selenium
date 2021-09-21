package Resource;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	public static WebDriver driver;
	 public Properties Prop;
	public WebDriver intializeDriver() throws IOException{
		String BrowserName  = "chrome";

	//when running headless make sure it is 
	if (BrowserName.contains("chrome"))
	  {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\main\\java\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
	
     		driver = new ChromeDriver();
	  }
	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
		return driver;
	}

	public void getScreenShot(String resul) throws IOException   
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       //common ios 
		//import org.apache.commons.io.FileUtils;this is needed for that i have added dependency in maven
		FileUtils.copyFile(src,new File ("C:\\Users\\Shraddha\\images\\" + resul + "screenshot.png"));
	}
}
