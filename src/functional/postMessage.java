//Post Message

package functional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class postMessage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\katie\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pmamhcm.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='modal-header']//child::button")).click();
		Actions action = new Actions(driver);
		WebElement hoverLogin=driver.findElement(By.xpath("//div[@id='navbarDropdownLogin']"));
		action.moveToElement(hoverLogin).build().perform();
		driver.switchTo().frame(driver.findElement(By.id("frmLogin")));
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtUserName']"))).click().sendKeys("sales.demo@pmam.com").build().perform();
		action.moveToElement(driver.findElement(By.xpath("//input[@name='TxtPassword']"))).click().sendKeys("Dallas@2019").build().perform();
		action.moveToElement(driver.findElement(By.xpath("//input[@name='btnNewLogin']"))).click().build().perform();
		Thread.sleep(5000);
		WebElement hoverDropdown=driver.findElement(By.xpath("//input[@id='HCM_Menu_imgSet']"));
		action.moveToElement(hoverDropdown).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Send Message')]")).click();
		driver.findElement(By.xpath("//input[@id='txtSubject']")).sendKeys("This is a Test Message");
		driver.findElement(By.id("txtMessage")).sendKeys("Test Automation of the Message Section");
		driver.findElement(By.xpath("//input[@value='Select Employees & Send Message']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='EmpDtl_ctl30_ChkSelectEmp']")).click();
		driver.findElement(By.xpath("//input[@id='btnBroadcastEmp']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='Button2']")).click();
		driver.findElement(By.xpath("//a[@id='homelogo']")).click();
		driver.findElement(By.xpath("//a[@id='GrdMsg_ctl02_lnkArchive']")).click();
	}
	
}
