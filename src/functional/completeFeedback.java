//Assign and Complete a Feedback

package functional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class completeFeedback {

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
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[6]/a[1]")).click();
		driver.findElement(By.xpath("//div[@class='menu']//a[contains(text(),'Feedback Form')]")).click();
		Thread.sleep(2000);
		WebElement hoverAssign=driver.findElement(By.xpath("//body/form[@id='form1']/table/tbody/tr/td/table/tbody/tr[@id='getActiveFeedback']/td/div[@id='PnlCertList']/div/table[@id='gvCertificationList']/tbody/tr[8]/td[6]/div[1]/div[1]/img[1]"));
		action.moveToElement(hoverAssign).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("gvCertificationList_ctl08_LnkAssign")).click();
		driver.findElement(By.id("EmpDtl_ctl37_ChkSelectEmp")).click();
		driver.findElement(By.id("btnDone")).click();
		action.moveToElement(driver.findElement(By.xpath("//input[@id='TxtCompletionDate']"))).click().sendKeys("12/31/2050").build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Close')]")).click();
		driver.findElement(By.id("btnAssign")).click();
		driver.findElement(By.xpath("//a[@id='homelogo']//img")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Assessment Checklist')]")).click();

		for (String winHandle : driver.getWindowHandles())
		{
			driver.switchTo().window(winHandle);
		}
		
		driver.findElement(By.id("btnSubmit")).click();
		driver.findElement(By.id("BtnSend")).click();
		
		for (String winHandle : driver.getWindowHandles())	
		{
			driver.switchTo().window(winHandle);
		}
		

		driver.quit();	
	}
	
}
