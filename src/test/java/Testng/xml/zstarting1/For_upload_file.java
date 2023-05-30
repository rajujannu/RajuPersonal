package Testng.xml.zstarting1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class For_upload_file {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		driver.get("https://the-internet.herokuapp.com/upload");
		
		//String path = System.getProperty("user.dir")+"\\Fastimg\\rob.png";
		//StringSelection selection=new StringSelection("C:\\Users\\jrajk\\Downloads");
		//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		
		WebElement rk= driver.findElement(By.id("file-upload"));
		Actions action= new Actions(driver);
		action.moveToElement(rk).click().build().perform();
		
		
		Robot robo=new Robot();
		
		StringSelection selection=new StringSelection("C:\\Users\\jrajk\\Downloads");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		robo.delay(3000);
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		
		robo.delay(3000);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//input[@class='button']")).click();
		

	}

}
