//Assigns and Unassigns a training

package functional ;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignUnassignTraining {

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
		driver.findElement(By.xpath("//a[contains(text(),'Training')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Assign Training')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'ALERRT - Active Shooter')]")).click();
		driver.findElement(By.xpath("//input[@id='btnUpdateAssign']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnAssignSelected']")).click();
		driver.findElement(By.xpath("//input[@id='TabIntExternalEmpList_PanlInternal_EmpDtl_ctl10_chkId']")).click();
		driver.findElement(By.xpath("//input[@id='btnEmployeeNew']")).click();	
		driver.findElement(By.id("TabContainer1_TabPanel1_GridviewAssign_ctl02_GridviewTraining_ctl02_BtnFromdate")).click();
		driver.findElement(By.id("TabContainer1_TabPanel1_GridviewAssign_ctl02_GridviewTraining_ctl02_CalendarExtender21_today")).click();
		driver.findElement(By.id("TabContainer1_TabPanel1_GridviewAssign_ctl02_GridviewTraining_ctl02_btnEndDate")).click();
		driver.findElement(By.id("TabContainer1_TabPanel1_GridviewAssign_ctl02_GridviewTraining_ctl02_CalendarExtender1_today")).click();		
		driver.findElement(By.xpath("//input[@id='BtnSave']")).click();
		driver.findElement(By.xpath("//input[@id='btnCloseContent1']")).click();
		driver.findElement(By.id("GridviewTraining_ctl05_lnkUnassign")).click();
		Thread.sleep(5000);
		String parentHandle = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles())
		{
			driver.switchTo().window(winHandle);
		}
		driver.findElement(By.xpath("//*[@id='GrdAssignedTraining_ctl02_ChkAssignedTraining']")).click();
		driver.findElement(By.xpath("//input[@id='btnDeleteAssignedTraining']")).click();
		Alert alert = driver.switchTo().alert();
        alert.accept();
        String winHandleBefore=driver.getWindowHandle();
        driver.switchTo().window(winHandleBefore);
        driver.close();
        driver.switchTo().window(parentHandle);
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		driver.close();	
	}
	
}
