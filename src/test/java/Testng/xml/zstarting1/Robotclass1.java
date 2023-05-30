package Testng.xml.zstarting1;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robotclass1 {

	public static void main(String[] args) throws AWTException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");

		driver.findElement(By.name("search")).sendKeys("HP");
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

		Rectangle rectangle = new Rectangle(50, 50, 300, 1000);
		BufferedImage srcimg = robo.createScreenCapture(rectangle);
		ImageIO.write(srcimg, "PNG", new File("C:\\Users\\jrajk\\eclipse-workspace\\zstarting1\\Fastimg/rob.png"));
         
		Dimension d= Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle2 =new Rectangle(d);
		BufferedImage srcimg2=robo.createScreenCapture(rectangle2);
		ImageIO.write(srcimg2, "PNG",new File("C:\\Users\\jrajk\\eclipse-workspace\\zstarting1\\Fastimg/rob1.png"));
		
		robo.mouseWheel(20);
		robo.delay(2000);//ms
		robo.mouseWheel(-20);
		
		
		
		
		
		
	}

}
