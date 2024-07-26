package Seleweek1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/upload/");
		driver.manage().window().maximize();
		
				WebElement fileupload= driver.findElement(By.id("uploadfile_0"));
				
				Actions click= new Actions(driver);
				click.moveToElement(fileupload).click().perform();
				StringSelection ss = new StringSelection("C:\\Users\\reshma.s02\\Downloads\\SELEDEMO.xlsx");  //storing the file to ss
		   	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		   
		     Robot robot = new Robot(); //command for pasting 
		     //robot.delay(350);
		     robot.keyPress(KeyEvent.VK_CONTROL); //press ctrl key"C:\Users\reshma.s02\Downloads\RESHMA.S._M_Senior_Software_Test_Engineer.pdf"
		     
		     robot.keyPress(KeyEvent.VK_V); //press ctrl v
		     //robot.delay(450);
		     robot.keyRelease(KeyEvent.VK_CONTROL); //release ctrl key
		     robot.keyRelease(KeyEvent.VK_V); //release ctrlv
		     //robot.delay(500);
		     robot.keyPress(KeyEvent.VK_ENTER); //press enter key
		     robot.keyRelease(KeyEvent.VK_ENTER); //release enter key 
		     System.out.println("done"); 
		   	     
		   	     //fileupload.sendKeys("C:\\Users\\reshma.s02\\Downloads\\SELEDEMO.xlsx");
		     
		     
		     WebElement acceptbutton=driver.findElement(By.id("terms"));
		     acceptbutton.click();
		     WebElement submitbutton= driver.findElement(By.id("submitbutton"));
		     submitbutton.click();
		   	     
		   	     
	}

}
