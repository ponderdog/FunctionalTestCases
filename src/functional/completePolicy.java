//Assign and Complete a Policy

package functional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class completePolicy {

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
		driver.findElement(By.xpath("//a[contains(text(),'Policy')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Assign Policy')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'TPCA POLICY')]")).click();
		driver.findElement(By.xpath("//input[@id='rptLevel_ctl01_rptLevelContent_ctl03_chkpublishLevelContent']")).click();
		driver.findElement(By.xpath("//input[@id='btnpublish']")).click();
		driver.findElement(By.xpath("//input[@id='btnAssignSelected']")).click();
		driver.findElement(By.id("TabIntExternalEmpList_PanlInternal_EmpDtl_ctl37_chkId")).click();
		driver.findElement(By.xpath("//input[@id='btnTopContinue']")).click();
		driver.findElement(By.xpath("//input[@id='TabContainer1_TabPanel1_GvAssignPolicyDoc_ctl02_BtnFromdate']")).click();
		driver.findElement(By.xpath("//div[@id='TabContainer1_TabPanel1_GvAssignPolicyDoc_ctl02_CalendarExtender21_today']")).click();
		driver.findElement(By.xpath("//input[@id='TabContainer1_TabPanel1_GvAssignPolicyDoc_ctl02_btnEndDate']")).click();
		driver.findElement(By.xpath("//div[@id='TabContainer1_TabPanel1_GvAssignPolicyDoc_ctl02_CalendarExtender1_today']")).click();
		driver.findElement(By.xpath("//input[@id='BtnSave']")).click();
		driver.findElement(By.xpath("//input[@id='btnCloseContent1']")).click();
		driver.findElement(By.xpath("//a[@id='homelogo']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'1.3 Fiscal Management')]")).click();
		String parentHandle = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles())
		{
			driver.switchTo().window(winHandle);
		}
        driver.close();
        driver.switchTo().window(parentHandle);
		driver.findElement(By.xpath("//input[@id='gvPolicy_ctl02_chkCompltdTrng']")).click();
		for (String winHandle : driver.getWindowHandles())
		{
			driver.switchTo().window(winHandle);		
		}
		driver.findElement(By.xpath("//input[@id='chkSelectAll']")).click();
		driver.findElement(By.xpath("//input[@name='GrdSignature$ctl02$btnESign']")).click();
        driver.findElement(By.xpath("//input[@id='btnSubmit']")).click();
        driver.switchTo().window(parentHandle);
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		driver.close();
	}
	
}	